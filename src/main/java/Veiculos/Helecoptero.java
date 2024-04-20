package Veiculos;

import Interface.InterfaceVeiculos;
import Militares.Militares;

import java.math.BigDecimal;

public class Helecoptero extends Veiculos implements InterfaceVeiculos {

    public Helecoptero(Militares piloto, int qntTripulacao, BigDecimal quilometroLitro, double precoLitro) {
        super(piloto, qntTripulacao, quilometroLitro, precoLitro);
    }

    @Override
    public boolean tripulacaoValida(int tripulacao) {
        return false;
    }
}
