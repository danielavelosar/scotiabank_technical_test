# CRUD de Productos

Este proyecto es una aplicación básica de CRUD para gestionar una entidad `Producto`, desarrollada en Java usando Spring Boot.

## Funcionalidades

El controlador principal (`ProductController`) permite las siguientes operaciones:
- **GET /products/all**: Obtener la lista de todos los productos.
- **GET /products/{id}**: Obtener un producto específico por su ID.
- **POST /products/save**: Crear un nuevo producto.
- **PUT /products/update**: Actualizar un producto existente.
- **DELETE /products/{id}**: Eliminar un producto por su ID.

## Requisitos

- **Java 11** o superior.
- **Maven** (para gestionar dependencias).
- **Base de datos**: La aplicación debe estar configurada para conectarse a una base de datos compatible con JPA (por ejemplo, MySQL, PostgreSQL). Las configuraciones se encuentran en `application.properties`.

## Configuración

1. Clona el repositorio y navega a la carpeta raíz del proyecto:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd <NOMBRE_DEL_PROYECTO>
   
## Ejecución
1. Para ejecutar la aplicación, usa el siguiente comando en la raíz del proyecto:
   ```bash
    mvn spring-boot:run
   
La aplicación estará disponible en http://localhost:8080. 

 


