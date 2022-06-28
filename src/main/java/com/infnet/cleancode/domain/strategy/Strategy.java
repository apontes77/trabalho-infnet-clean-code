package com.infnet.cleancode.domain.strategy;

import java.math.BigDecimal;

public interface Strategy {
    public BigDecimal reajustaSalario(BigDecimal salario);
}
