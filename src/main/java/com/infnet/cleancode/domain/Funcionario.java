package com.infnet.cleancode.domain;

import com.infnet.cleancode.domain.enums.CargoEnum;
import com.infnet.cleancode.domain.enums.SetorEnum;
import com.infnet.cleancode.domain.strategy.CalculadoraDeReajusteDeAcordoComOCargo;
import com.infnet.cleancode.domain.strategy.Strategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Getter
@NoArgsConstructor
public class Funcionario {
    private String nome;
    private List<Telefone> telefone;
    private Endereco endereco;
    private BigDecimal salario;
    private SetorEnum setor;
    private CargoEnum cargo;
    private CalculadoraDeReajusteDeAcordoComOCargo calculadora;

    public Funcionario(CalculadoraDeReajusteDeAcordoComOCargo calculadora) {
        this.calculadora = calculadora;
    }

    public BigDecimal reajusteSalarial(BigDecimal salario) {
        return calculadora.executeStrategy(salario);
    }
}
