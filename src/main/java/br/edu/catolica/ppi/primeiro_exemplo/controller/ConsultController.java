package br.edu.catolica.ppi.primeiro_exemplo.controller;

import br.edu.catolica.ppi.primeiro_exemplo.model.Consult;
import br.edu.catolica.ppi.primeiro_exemplo.service.ConsultService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consult")
public class ConsultController {

    private final ConsultService consultService;

    public ConsultController(ConsultService consultService) {
        this.consultService = consultService;
    }


    @PostMapping
    public ResponseEntity save(@RequestBody Consult consult){
        return ResponseEntity.ok().body(consultService.save(consult));

    }

}
