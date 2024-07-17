# ForoHub

ForoHub es una API REST creada con Spring Boot que permite la gestión de tópicos en un foro. La API permite a los usuarios crear, leer, actualizar y eliminar tópicos. Este proyecto sigue las mejores prácticas de desarrollo REST y utiliza autenticación básica para proteger el acceso a la información.

## Características

- Crear un nuevo tópico
- Mostrar todos los tópicos creados
- Mostrar un tópico específico
- Actualizar un tópico
- Eliminar un tópico

## Tecnologías Utilizadas

- Java 17
- Spring Boot 3.3.1
- Spring Data JPA
- Spring Security
- H2 Database (para pruebas en memoria)
- Maven

## Requisitos Previos

- Java 17 o superior
- Maven 3.6.3 o superior

## Configuración del Proyecto
El proyecto está configurado para utilizar una base de datos en memoria H2 para propósitos de desarrollo y pruebas. No se requiere configuración adicional para empezar.

Ejecutar la Aplicación
Puedes ejecutar la aplicación usando Maven:
mvn spring-boot:run

O puedes compilar y ejecutar el JAR generado:
mvn clean package
java -jar target/Desafio3ForoAlura-0.0.1-SNAPSHOT.jar

## Acceder a la Consola de H2
La consola de H2 estará disponible en http://localhost:8080/h2-console. Usa la siguiente configuración para conectarte:

JDBC URL: jdbc:h2:mem:forohub
Username: sa
Password: (dejar en blanco)
Endpoints de la API
Crear un Nuevo Tópico
POST /topicos

{
  "titulo": "Título del tópico",
  "mensaje": "Contenido del mensaje"
}

## Autenticación
La API utiliza autenticación básica. Usa las siguientes credenciales para acceder a los endpoints protegidos:

Username: usuario
Password: password
### Clonar el Repositorio

```bash
git clone https://github.com/tu-usuario/ForoHub.git
cd ForoHub
