package com.infnet.cleancode.domain.enums;

public enum SetorEnum {
    DESENVOLVIMENTO ("desenvolvimento"),
    DEVOPS ("devops"),
    BANCO_DE_DADOS("banco de dados");
    private String descricao;

    SetorEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
