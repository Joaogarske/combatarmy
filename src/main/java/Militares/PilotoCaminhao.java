package Militares;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PilotoCaminhao extends Militares{

    private LocalDate dataLicencaCaminhao;

    public PilotoCaminhao(BigDecimal salario, LocalDate dataLicencaCaminhao) {
        super(salario);
        this.dataLicencaCaminhao = dataLicencaCaminhao;
    }

    public LocalDate getDataLicencaCaminhao() {
        return dataLicencaCaminhao;
    }

    public void setDataLicencaCaminhao(LocalDate dataLicencaCaminhao) {
        this.dataLicencaCaminhao = dataLicencaCaminhao;
    }
}
