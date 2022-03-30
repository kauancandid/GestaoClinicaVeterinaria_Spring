package br.edu.catolica.ppi.primeiro_exemplo.controller;

import br.edu.catolica.ppi.primeiro_exemplo.model.Owner;
import br.edu.catolica.ppi.primeiro_exemplo.service.OwnerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    private final OwnerService ownerService;


    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Owner owner){
        return ResponseEntity.ok().body(ownerService.save(owner));
//        Owner own = ownerService.save(owner);
//        return ResponseEntity.ok().body(own);

    }

    @GetMapping("/findById/{id}")
    public ResponseEntity getById(@PathVariable("id") UUID id){
        return ResponseEntity.ok().body(ownerService.findById(id));

    }

    @GetMapping("/findByCpf/{cpf}")
    public ResponseEntity getByCpf(@PathVariable("cpf") String cpf){
        return ResponseEntity.ok().body(ownerService.findByCpf(cpf));

    }

    @GetMapping("/findByName/{name}")
    public ResponseEntity getByName(@PathVariable("name") String name){
        return ResponseEntity.ok().body(ownerService.findByName(name));

    }

    @GetMapping("/all")
    public ResponseEntity findAll(){
        return ResponseEntity.ok().body(ownerService.getAll());

    }

}