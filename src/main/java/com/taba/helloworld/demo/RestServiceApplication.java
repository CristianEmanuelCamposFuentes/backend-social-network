
// Clase principal de la aplicación Spring Boot
package com.taba.helloworld.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Anotación SpringBootApplication que combina varias anotaciones de Spring Boot
@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		// Método main para iniciar la aplicación Spring Boot
		SpringApplication.run(RestServiceApplication.class, args);
	}

}