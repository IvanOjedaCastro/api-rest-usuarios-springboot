package com.iojeda.prueba.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HolaController {

    @GetMapping("/hola")
    public String saludar() {
        return "¡Spring Boot con Java 21 rulando sin problemas!";
    }

    @GetMapping("/saludo")
    public Map<String, Object> saludarPersona(@RequestParam(defaultValue = "Ivan") String nombre) {
        return Map.of(
            "mensaje", "Bienvenido a tu API REST",
            "usuario", nombre,
            "estado", "OK",
            "codigo", 200
        );
    }
}