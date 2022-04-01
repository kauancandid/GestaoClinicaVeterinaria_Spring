package br.edu.catolica.ppi.primeiro_exemplo.repository;

import br.edu.catolica.ppi.primeiro_exemplo.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VetRepository extends JpaRepository<Vet, UUID> {




}
