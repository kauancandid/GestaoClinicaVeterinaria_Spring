package br.edu.catolica.ppi.primeiro_exemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {


    @GetMapping
    public String helloSpring(){
        return "Hi Spring!!!";
    }
}
