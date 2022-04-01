package br.edu.catolica.ppi.primeiro_exemplo.repository;

import br.edu.catolica.ppi.primeiro_exemplo.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, UUID> {

    Optional<Owner> findByCpf(String cpf);

//    as % é pra trazer todos os responsáveis que
//    tenha uma parte do nome dito, exemplo an
//    todo nome que tiver an ele retorna

    @Query("select r.name from Person r where r.name like %:name%")
    Owner findByName(String name);




}
