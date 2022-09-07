package com.tienda.sprintBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/")
    public String saludar() {
        return "Mi primera pagina web con Spring Boot";
    }

    @GetMapping("/about")
    public String presentar() {
        return "Hoa me llamo Milena Montoya";
    }
}
