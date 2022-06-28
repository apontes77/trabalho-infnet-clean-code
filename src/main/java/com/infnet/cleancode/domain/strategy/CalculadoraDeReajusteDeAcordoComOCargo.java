package com.infnet.cleancode.domain.strategy;

import java.math.BigDecimal;

public class CalculadoraDeReajusteDeAcordoComOCargo {
    private Strategy strategy;

    public CalculadoraDeReajusteDeAcordoComOCargo(Strategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal executeStrategy(BigDecimal salario) {
        return strategy.reajustaSalario(salario);
    }
}