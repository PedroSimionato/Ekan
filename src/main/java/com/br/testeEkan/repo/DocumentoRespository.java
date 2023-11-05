package com.br.testeEkan.repo;

import com.br.testeEkan.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRespository extends JpaRepository<Documento, String> {
}
