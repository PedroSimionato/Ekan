package com.br.testeEkan.dto;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class DocumentoDto {

    @NotNull
    private String tipoDocumento;

    @NotNull
    private String descricao;
}
