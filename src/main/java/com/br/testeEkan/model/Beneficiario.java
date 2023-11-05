package com.br.testeEkan.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
public class Beneficiario {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private String beneficiaroId;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String dataNasicmento;

    @Column(nullable = false)
    private String dataInclusao;

    @Column(nullable = false)
    private String dataAlteracao;

    @OneToMany(mappedBy = "beneficiario")
    private List<Documento> documentos;
}
