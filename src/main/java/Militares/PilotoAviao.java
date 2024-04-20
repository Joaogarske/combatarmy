package Militares;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PilotoAviao extends Militares{

    private LocalDate dataLicencaAviao;

    public PilotoAviao(BigDecimal salario, LocalDate dataLicencaAviao) {
        super(salario);
        this.dataLicencaAviao = dataLicencaAviao;
    }

    public LocalDate getDataLicencaAviao() {
        return dataLicencaAviao;
    }

    public void setDataLicencaAviao(LocalDate dataLicencaAviao) {
        this.dataLicencaAviao = dataLicencaAviao;
    }
}
