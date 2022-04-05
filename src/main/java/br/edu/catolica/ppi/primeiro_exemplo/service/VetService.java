package br.edu.catolica.ppi.primeiro_exemplo.service;

import br.edu.catolica.ppi.primeiro_exemplo.model.Consult;
import br.edu.catolica.ppi.primeiro_exemplo.model.Vet;
import org.springframework.stereotype.Service;



@Service
public class VetService {

    private final VetService vetService;

    public VetService(VetService vetService) {
        this.vetService = vetService;
    }

    public Consult save(Vet vet){
        return vetService.save(vet);
    }

}
