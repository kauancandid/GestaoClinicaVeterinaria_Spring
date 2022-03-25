package br.edu.catolica.ppi.primeiro_exemplo.repository;

import br.edu.catolica.ppi.primeiro_exemplo.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, UUID> {


}
