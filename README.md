# Concesionaria - Sistema de Gestión de Automóviles

La tienda de venta de automóviles requiere un sistema que permita realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) de todos los vehículos disponibles para luego publicarlos en un catálogo. A continuación, se presenta el modelado de la clase `Automovil` y la estructura del sistema, respetando el modelo de capas.

## Modelo de Clase Automovil

La clase `Automovil` se ha modelado con los siguientes atributos:
- **id:** Identificador único del automóvil.
- **marca:** Marca del automóvil.
- **modelo:** Modelo del automóvil.
- **color:** Color del automóvil.
- **motor:** Tipo de motor del automóvil.
- **patente:** Número de placa del automóvil.
- **cantidadPuertas:** Cantidad de puertas del automóvil.

## Operaciones CRUD

### 1. Crear (Create)
- Método para agregar un nuevo automóvil al sistema.

### 2. Leer (Read)
- Método para obtener la información de un automóvil específico.
- Método para obtener la lista completa de automóviles en venta.

### 3. Actualizar (Update)
- Método para modificar los detalles de un automóvil existente.

### 4. Eliminar (Delete)
- Método para eliminar un automóvil del sistema.

## Modelo de Capas

El sistema sigue el modelo de capas para una mejor organización y separación de responsabilidades:

### 1. Lógica
- Contiene las operaciones CRUD de la clase `Automovil`.
- Gestiona la lógica de negocio.

### 2. Interfaz Gráfica (GUI)
- Proporciona la interfaz de usuario para interactuar con el sistema.
- Permite al usuario realizar operaciones CRUD de forma intuitiva.

### 3. Persistencia (JPA)
- Se encarga del almacenamiento y recuperación de datos en una base de datos.
- Utiliza Java Persistence API (JPA) para la interacción con la capa de base de datos.

## Uso del Sistema

1. Ejecutar la aplicación.
2. Utilizar la interfaz gráfica para agregar, visualizar, actualizar o eliminar automóviles.

## Requisitos

- Java Development Kit (JDK) instalado.
- Conexión a una base de datos compatible con JPA.

## Contribuciones

¡Las contribuciones son bienvenidas! Si encuentras algún problema o tienes sugerencias de mejora, no dudes en abrir un problema o enviar una solicitud de extracción.

---

¡Gracias por utilizar el Sistema de Gestión de Automóviles de la Concesionaria! Si tienes alguna pregunta o comentario, no dudes en ponerte en contacto conmigo.
