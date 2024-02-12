# Demo de Servicio REST con Spring Boot

Este es un proyecto de demostración de un servicio REST básico desarrollado con Spring Boot.

## Descripción

Este proyecto implementa un servicio REST simple que responde a las solicitudes GET en la ruta "/greeting" con un mensaje de saludo personalizado. El mensaje de saludo incluye un identificador único y el nombre proporcionado como parámetro en la solicitud.

## Tecnologías utilizadas

- Java
- Spring Boot
- Maven

## Configuración

Para ejecutar este proyecto localmente, asegúrate de tener instalado Java y Maven en tu sistema. Luego, puedes seguir estos pasos:

1. Clona este repositorio a tu máquina local.
2. Abre una terminal y navega hasta la carpeta del proyecto.
3. Ejecuta el comando `mvn spring-boot:run` para iniciar la aplicación.
4. Una vez iniciado, puedes acceder al servicio REST en `http://localhost:8080/greeting`.

## Uso

Puedes enviar solicitudes GET al servicio REST utilizando cualquier cliente HTTP, como curl o Postman. Por ejemplo:

    `http://localhost:8080/greeting?name=Cristian`


Esto devolverá un mensaje de saludo personalizado para el nombre proporcionado.
