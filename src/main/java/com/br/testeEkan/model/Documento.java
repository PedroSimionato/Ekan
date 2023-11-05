package com.br.testeEkan.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String documentoId;

    @Column(nullable = false)
    private String tipoDocumento;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String dataInclusao;

    @Column(nullable = false)
    private String dataAtualizacao;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Beneficiario beneficiario;
}
