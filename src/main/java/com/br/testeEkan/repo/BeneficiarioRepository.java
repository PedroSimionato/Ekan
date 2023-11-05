package com.br.testeEkan.repo;

import com.br.testeEkan.model.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, String> {
}
