package br.edu.catolica.ppi.primeiro_exemplo.service;

import br.edu.catolica.ppi.primeiro_exemplo.model.Owner;
import br.edu.catolica.ppi.primeiro_exemplo.repository.OwnerRepository;
import br.edu.catolica.ppi.primeiro_exemplo.utils.DateUtil;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public Owner save(Owner owner) {
//        owner.setBirthDate(DateUtil.stringToLocalDate(owner.getBirthDate().toString()));
        return ownerRepository.save(owner);
    }

    public Owner findById(UUID id) {
        Optional<Owner> ownerOptional = ownerRepository.findById(id);
        return ownerOptional
                .orElseThrow(() -> new RuntimeException("Responsavel não localizado"));
//        if(ownerOptional.isPresent()){
//            return ownerOptional.get();
//        }
//        return null;
    }

    public Owner findByCpf(String cpf) {
        Optional<Owner> ownerOptional = ownerRepository.findByCpf(cpf);
        return ownerOptional
                .orElseThrow(() -> new RuntimeException("CPF não existe na base de dados"));
    }

    public Owner findByName(String name) {
        Optional<Owner> ownerOptional = Optional.ofNullable(ownerRepository.findByName(name));
        return ownerOptional
                .orElseThrow(() -> new RuntimeException("Nome não existe na base de dados"));

    }

    public List<Owner> getAll(){
        return ownerRepository.findAll();
    }

}
