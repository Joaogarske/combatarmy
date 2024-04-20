package Militares;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Elite extends Militares{

    private LocalDate dataLicencaAviao;
    private LocalDate dataLicencaTanque;

    private LocalDate dataLicencaHelecoptero;
    private LocalDate dataLicencaCaminhao;


    public Elite(BigDecimal salario, LocalDate dataLicencaAviao, LocalDate dataLicencaTanque, LocalDate dataLicencaHelecoptero, LocalDate dataLicencaCaminhao) {
        super(salario);
        this.dataLicencaAviao = dataLicencaAviao;
        this.dataLicencaTanque = dataLicencaTanque;
        this.dataLicencaHelecoptero = dataLicencaHelecoptero;
        this.dataLicencaCaminhao = dataLicencaCaminhao;
    }

    public LocalDate getDataLicencaAviao() {
        return dataLicencaAviao;
    }

    public void setDataLicencaAviao(LocalDate dataLicencaAviao) {
        this.dataLicencaAviao = dataLicencaAviao;
    }

    public LocalDate getDataLicencaTanque() {
        return dataLicencaTanque;
    }

    public void setDataLicencaTanque(LocalDate dataLicencaTanque) {
        this.dataLicencaTanque = dataLicencaTanque;
    }

    public LocalDate getDataLicencaHelecoptero() {
        return dataLicencaHelecoptero;
    }

    public void setDataLicencaHelecoptero(LocalDate dataLicencaHelecoptero) {
        this.dataLicencaHelecoptero = dataLicencaHelecoptero;
    }

    public LocalDate getDataLicencaCaminhao() {
        return dataLicencaCaminhao;
    }

    public void setDataLicencaCaminhao(LocalDate dataLicencaCaminhao) {
        this.dataLicencaCaminhao = dataLicencaCaminhao;
    }
}
