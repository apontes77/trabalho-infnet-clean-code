package com.infnet.cleancode.domain.enums;

public enum CargoEnum {
    ESTAGIARIO ("estagiario"),
    JUNIOR("junior"),
    PLENO("pleno"),
    SENIOR("senior");

    private String descricao;

    CargoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
