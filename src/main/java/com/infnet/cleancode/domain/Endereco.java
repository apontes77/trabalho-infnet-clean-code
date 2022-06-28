package com.infnet.cleancode.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Endereco {
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
}
