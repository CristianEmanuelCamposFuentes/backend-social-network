
// Controlador REST para manejar las solicitudes relacionadas con los saludos
package com.taba.helloworld.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

// Anotación RestController para indicar que esta clase es un controlador REST
@RestController
public class GreetingController {
    // Plantilla para el saludo
    private static final String template = "Hello, %s!";
    // Contador atómico para generar identificadores únicos para los saludos
    private final AtomicLong counter = new AtomicLong();

    // Método para manejar las solicitudes GET a /greeting
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        // Devuelve un nuevo objeto Greeting con un ID único y un mensaje de saludo formateado
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}