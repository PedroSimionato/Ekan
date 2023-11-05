package com.br.testeEkan.controller;

import com.br.testeEkan.dto.BeneficiarioDto;
import com.br.testeEkan.model.Beneficiario;
import com.br.testeEkan.model.Documento;
import com.br.testeEkan.repo.BeneficiarioRepository;
import com.br.testeEkan.repo.DocumentoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDate;

@RestController
@RequestMapping("api/v1/beneficiario")
public class BeneficiarioController {

    private final BeneficiarioRepository beneficiarioRepository;
    private final DocumentoRespository documentoRespository;

    @Autowired
    public BeneficiarioController(BeneficiarioRepository beneficiarioRepository,
                                  DocumentoRespository documentoRespository){
        this.beneficiarioRepository = beneficiarioRepository;
        this.documentoRespository = documentoRespository;
    }

    @PostMapping("/create")
    public ResponseEntity<BeneficiarioDto> createBeneficiario(@Valid @RequestBody BeneficiarioDto beneficiarioDto){

        salvarBeneficiario(beneficiarioDto);
        return ResponseEntity.ok(beneficiarioDto);
    }

    private void salvarBeneficiario(BeneficiarioDto beneficiarioDto){
        var beneficiario = Beneficiario.builder()
                .nome(beneficiarioDto.getNome())
                .telefone(beneficiarioDto.getTelefone())
                .dataNasicmento(beneficiarioDto.getDataNasicmento())
                .dataAlteracao(LocalDate.now().toString())
                .dataInclusao(LocalDate.now().toString())
                .build();

        beneficiarioRepository.save(beneficiario);
    }
}
