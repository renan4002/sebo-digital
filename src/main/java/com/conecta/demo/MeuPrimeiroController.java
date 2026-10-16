
package com.conecta.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuPrimeiroController {

    @GetMapping("/")
    public String inicio() {
        return "Minha primeira aplicação web com Spring Boot!";
    }
}
