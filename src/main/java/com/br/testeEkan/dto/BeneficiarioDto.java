package com.br.testeEkan.dto;

import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
public class BeneficiarioDto {

    @NotNull
    private String nome;

    @NotNull
    private String telefone;

    @NotNull
    private String dataNasicmento;

    @NotNull
    private List<DocumentoDto> documentos;

}
