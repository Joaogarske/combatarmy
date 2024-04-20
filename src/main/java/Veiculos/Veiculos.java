package Veiculos;

import Militares.Militares;

import java.math.BigDecimal;

public class Veiculos {

    private Militares piloto;
    private int qntTripulacao;

    private BigDecimal quilometroLitro;

    private double precoLitro;

    public Veiculos(Militares piloto, int qntTripulacao, BigDecimal quilometroLitro, double precoLitro) {
        this.piloto = piloto;
        this.qntTripulacao = qntTripulacao;
        this.quilometroLitro = quilometroLitro;
        this.precoLitro = precoLitro;
    }

    public Militares getPiloto() {
        return piloto;
    }

    public void setPiloto(Militares piloto) {
        this.piloto = piloto;
    }

    public int getQntTripulacao() {
        return qntTripulacao;
    }

    public void setQntTripulacao(int qntTripulacao) {
        this.qntTripulacao = qntTripulacao;
    }

    public BigDecimal getQuilometroLitro() {
        return quilometroLitro;
    }

    public void setQuilometroLitro(BigDecimal quilometroLitro) {
        this.quilometroLitro = quilometroLitro;
    }

    public double getPrecoLitro() {
        return precoLitro;
    }

    public void setPrecoLitro(double precoLitro) {
        this.precoLitro = precoLitro;
    }
}
