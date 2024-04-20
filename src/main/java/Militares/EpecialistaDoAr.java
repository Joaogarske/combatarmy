package Militares;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EpecialistaDoAr extends Militares {
    private LocalDate dataLicencaAviao;
    private LocalDate dataLicencaHelecoptero;

    public EpecialistaDoAr(BigDecimal salario, LocalDate dataLicencaAviao, LocalDate dataLicencaHelecoptero) {
        super(salario);
        this.dataLicencaAviao = dataLicencaAviao;
        this.dataLicencaHelecoptero = dataLicencaHelecoptero;
    }

    public LocalDate getDataLicencaAviao() {
        return dataLicencaAviao;
    }

    public void setDataLicencaAviao(LocalDate dataLicencaAviao) {
        this.dataLicencaAviao = dataLicencaAviao;
    }

    public LocalDate getDataLicencaHelecoptero() {
        return dataLicencaHelecoptero;
    }

    public void setDataLicencaHelecoptero(LocalDate dataLicencaHelecoptero) {
        this.dataLicencaHelecoptero = dataLicencaHelecoptero;
    }
}

