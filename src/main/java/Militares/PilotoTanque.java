package Militares;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PilotoTanque extends Militares{

    private LocalDate dataLicencaTanque;

    public PilotoTanque(BigDecimal salario, LocalDate dataLicencaTanque) {
        super(salario);
        this.dataLicencaTanque = dataLicencaTanque;
    }

    public LocalDate getDataLicencaTanque() {
        return dataLicencaTanque;
    }

    public void setDataLicencaTanque(LocalDate dataLicencaTanque) {
        this.dataLicencaTanque = dataLicencaTanque;
    }
}
