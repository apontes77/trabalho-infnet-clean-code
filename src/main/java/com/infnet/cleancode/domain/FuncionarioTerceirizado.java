package com.infnet.cleancode.domain;

import com.infnet.cleancode.domain.enums.CargoEnum;
import com.infnet.cleancode.domain.enums.SetorEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FuncionarioTerceirizado {
    private String nome;
    private List<Telefone> telefone;
    private Endereco endereco;
    private BigDecimal salario;
    private SetorEnum setor;
    private CargoEnum cargo;
    private String empresaContratada;
    private String tempoDePermanenciaPrevisto;
}
