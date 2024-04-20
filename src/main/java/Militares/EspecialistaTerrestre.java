package Militares;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EspecialistaTerrestre extends Militares{

    private LocalDate dataLicencaCaminhao;
    private LocalDate dataLicencaTanque;

    public EspecialistaTerrestre(BigDecimal salario, LocalDate dataLicencaCaminhao, LocalDate dataLicencaTanque) {
        super(salario);
        this.dataLicencaCaminhao = dataLicencaCaminhao;
        this.dataLicencaTanque = dataLicencaTanque;


    }

    public LocalDate getDataLicencaCaminhao() {
        return dataLicencaCaminhao;
    }

    public void setDataLicencaCaminhao(LocalDate dataLicencaCaminhao) {
        this.dataLicencaCaminhao = dataLicencaCaminhao;
    }

    public LocalDate getDataLicencaTanque() {
        return dataLicencaTanque;
    }

    public void setDataLicencaTanque(LocalDate dataLicencaTanque) {
        this.dataLicencaTanque = dataLicencaTanque;
    }
}
