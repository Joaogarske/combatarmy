package Militares;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PilotoHelicoptero extends Militares{
    private LocalDate dataLicencaHelecoptero;

    public PilotoHelicoptero(BigDecimal salario, LocalDate dataLicencaHelecoptero) {
        super(salario);
        this.dataLicencaHelecoptero = dataLicencaHelecoptero;
    }

    public LocalDate getDataLicencaHelecoptero() {
        return dataLicencaHelecoptero;
    }

    public void setDataLicencaHelecoptero(LocalDate dataLicencaHelecoptero) {
        this.dataLicencaHelecoptero = dataLicencaHelecoptero;
    }
}
