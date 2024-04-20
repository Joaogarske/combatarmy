package Veiculos;

import Interface.InterfaceVeiculos;
import Militares.Militares;

import java.math.BigDecimal;

public class Aviao extends Veiculos implements InterfaceVeiculos {

    public Aviao(Militares piloto, int qntTripulacao, BigDecimal quilometroLitro, double precoLitro) {
        super(piloto, qntTripulacao, quilometroLitro, precoLitro);
    }


    @Override
    public boolean tripulacaoValida(int tripulacao) {
        return false;
    }
}
