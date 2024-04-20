package Militares;

import java.math.BigDecimal;

public class Militares {

    private  BigDecimal salario;

    public Militares(BigDecimal salario){
        this.salario = salario;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
