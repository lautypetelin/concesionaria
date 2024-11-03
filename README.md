# Concesionaria - Sistema de Gestión de Automóviles

La tienda de venta de automóviles requiere un sistema que permita realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) de todos los vehículos disponibles para luego publicarlos en un catálogo. A continuación, se presenta el modelado de la clase `Automovil` y la estructura del sistema, respetando el modelo de capas.

![Pantalla inicial](https://github.com/user-attachments/assets/2945092b-d844-4fe0-9da7-f8c76f9d9b69)

## Almacenamiento en Base de Datos

Esta aplicación de escritorio registra en una base de datos los datos tanto de mascotas como de dueños que se ingresen desde la interfaz gráfica de usuario basado en los conceptos del MODELO DE CAPAS.

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

## Uso de la Aplicación

1. **Registro de Vehiculo:**
   - Completa el formulario con los datos de la mascota y su dueño.
  
![Carga de datos](https://github.com/user-attachments/assets/520d4845-f947-4799-838f-e5fd214f4a63)

2. **Visualización de Datos:**
   - La aplicación permitirá visualizar, editar y/o eliminar los datos registrados previamente.
  
![Visualización de datos](https://github.com/user-attachments/assets/f4754b96-7ccc-43ba-811f-95dcab1d4c16)

3. **Interfaz Gráfica Atractiva:**
   - La aplicación implementa una interfaz gráfica intuitiva para una experiencia de usuario atractiva.

## Requisitos

- JDK 17.0.6
- Algún Sistema Gestor de Base de Datos (SGBD)
- Importar al Gestor de Base de Datos el archivo .sql (ubicado en la carpeta resources) para poder hacer uso de la persistencia en la aplicación.

## Créditos

- **Desarrollado por**: Lautaro Tomás Israel Petelin
- **Tecnologías utilizadas**: Java 17.0.6, XAMPP
- **IDE**: Netbeans 17
- **Autor de la consigna**: Luisina de Paula / TodoCode

## Contribuciones

¡Las contribuciones son bienvenidas! Si encuentras algún problema o tienes sugerencias de mejora, no dudes en abrir un problema o enviar una pull request.
