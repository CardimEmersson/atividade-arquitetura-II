package com.irrigacao.irrigacao.controller;

import com.irrigacao.irrigacao.dtos.IrrigacaoDTO;
import com.irrigacao.irrigacao.models.IrrigacaoModel;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RestController
@EnableHystrix
public class ControllerIrrigacao {

    @Autowired
    private RestTemplate template;

    @GetMapping("/irrigacao")
    public String irrigacao() {
        return "Irrigação";
    }

    @PostMapping("/criar-irrigacao")
    @HystrixCommand(groupKey="irrigacao", commandKey="irrigacao", fallbackMethod="irrigacaoFallBack")
    public String criarIrrigacao(@RequestBody IrrigacaoDTO irrigacaoDto) {
        IrrigacaoModel irrigacaoModel = new IrrigacaoModel(irrigacaoDto.vazaoAgua, irrigacaoDto.tamanhoArea, irrigacaoDto.tipoJato, irrigacaoDto.tempoIrrigacao);
        
        return "Irrigação criada com sucesso!";
    }

    @HystrixCommand(groupKey="irrigacao", commandKey="irrigacao", fallbackMethod="irrigacaoFallBack")
    @GetMapping("/ligar-irrigacao")
    public String ligarIrrigacao() {
        System.out.println("Ligando irrigação...");

        String ligarIrrigacao = template.getForObject("http://localhost:8282/ligar-irrigacao", String.class);
        return ligarIrrigacao;
    }

    public String irrigacaoFallBack() {
        return "Não foi possível ligar a irrigação";
    }

    @Bean
    public RestTemplate template() {
        return new RestTemplate();
    }
}