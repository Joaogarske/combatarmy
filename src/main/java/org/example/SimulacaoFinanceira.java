package org.example;

import Veiculos.Veiculos;

public class SimulacaoFinanceira {

    private double distanciaViagem;

    private Veiculos veiculos;

    private int duracaoMissao;

    public SimulacaoFinanceira(double distanciaViagem, Veiculos veiculos, int duracaoMissao) {
        this.distanciaViagem = distanciaViagem;
        this.veiculos = veiculos;
        this.duracaoMissao = duracaoMissao;
    }

    public double getDistanciaViagem() {
        return distanciaViagem;
    }

    public void setDistanciaViagem(double distanciaViagem) {
        this.distanciaViagem = distanciaViagem;
    }

    public Veiculos getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculos veiculos) {
        this.veiculos = veiculos;
    }

    public int getDuracaoMissao() {
        return duracaoMissao;
    }

    public void setDuracaoMissao(int duracaoMissao) {
        this.duracaoMissao = duracaoMissao;
    }
}
