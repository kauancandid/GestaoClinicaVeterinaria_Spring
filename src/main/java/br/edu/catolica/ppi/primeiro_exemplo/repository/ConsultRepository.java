package br.edu.catolica.ppi.primeiro_exemplo.repository;

import br.edu.catolica.ppi.primeiro_exemplo.model.Consult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ConsultRepository extends JpaRepository<Consult, UUID> {
}
