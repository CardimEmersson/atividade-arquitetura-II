package com.irrigacao.irrigacao.models;

import java.io.Serializable;

public class IrrigacaoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private int vazaoAgua;
    private float tamanhoArea;
    private String tipoJato;
    private int tempoIrrigacao;

    public IrrigacaoModel(int vazaoAgua, float tamanhoArea, String tipoJato, int tempoIrrigacao) {
        this.vazaoAgua = vazaoAgua;
        this.tamanhoArea = tamanhoArea;
        this.tipoJato = tipoJato;
        this.tempoIrrigacao = tempoIrrigacao;
    }

    public int getVazaoAgua() {
        return vazaoAgua;
    }

    public void setVazaoAgua(int vazaoAgua) {
        this.vazaoAgua = vazaoAgua;
    }

    public float getTamanhoArea() {
        return tamanhoArea;
    }

    public void setTamanhoArea(float tamanhoArea) {
        this.tamanhoArea = tamanhoArea;
    }

    public String getTipoJato() {
        return tipoJato;
    }

    public void setTipoJato(String tipoJato) {
        this.tipoJato = tipoJato;
    }

    public int getTempoIrrigacao() {
        return tempoIrrigacao;
    }

    public void setTempoIrrigacao(int tempoIrrigacao) {
        this.tempoIrrigacao = tempoIrrigacao;
    }

}