package com.centralirrigacao.centralirrigacao;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
public class ControllerCentralIrrigacao {

    @GetMapping("/ligar-irrigacao")
    public String ligarIrrigacao() {

        return "Irrigação ligada com sucesso!";
    }

}