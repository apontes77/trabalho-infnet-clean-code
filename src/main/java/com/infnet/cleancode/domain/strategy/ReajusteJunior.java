package com.infnet.cleancode.domain.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ReajusteJunior implements Strategy{
    @Override
    public BigDecimal reajustaSalario(BigDecimal salario) {
        return salario.add(salario.multiply(new BigDecimal(0.15))).setScale(3, RoundingMode.DOWN);
    }
}
