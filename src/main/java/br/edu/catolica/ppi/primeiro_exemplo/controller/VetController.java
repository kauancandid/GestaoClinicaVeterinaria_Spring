package br.edu.catolica.ppi.primeiro_exemplo.controller;

import br.edu.catolica.ppi.primeiro_exemplo.model.Vet;
import br.edu.catolica.ppi.primeiro_exemplo.service.VetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vet")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Vet vet){
        return ResponseEntity.ok().body(vetService.save(vet));

    }

}