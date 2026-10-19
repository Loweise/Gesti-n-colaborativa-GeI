# Gestor de Tareas

Una aplicación de consola en Java para la administración de tareas personales. Este proyecto está diseñado como un Producto Mínimo Viable (MVP).

## Características Principales

* **Registrar tarea:** Permite añadir nuevas tareas pendientes a la lista.

* **Listar tareas:** Muestra todas las tareas registradas indicando visualmente si están pendientes `[ ]` o completadas `[X]`.

* **Completar tarea:** Permite cambiar el estado de una tarea a completada utilizando su número de ID.

## Tecnologías y Conceptos Aplicados

* **Lenguaje:** Java

* **Estructura de Datos:** Colecciones en memoria (`ArrayList`).

* **Arquitectura:** Separación de responsabilidades simulando MVC (Modelo, Vista, Controlador).

* **Manejo de Errores:** Bloques `try-catch` y lanzamiento de excepciones personalizadas para validación de datos.

## Estructura de Archivos

* `Tarea.java`: Define el modelo de datos y el estado de la tarea.

* `GestorTareas.java`: Contiene la lógica de negocio y el almacenamiento en memoria.

* `Main.java`: Maneja la interfaz de usuario en consola y la captura de excepciones.

## Cómo ejecutar el proyecto

1. Clona este repositorio en tu máquina local.

2. Abre una terminal y navega hasta el directorio donde se encuentran los archivos.

3. Compila el código fuente ejecutando el siguiente comando:

   ```
   javac *.java
   
   
   ```

4. Inicia la aplicación ejecutando la clase principal:

   ```
   java Main
   
   
   ```

## Contribuidores

* Martin Noe Cornejo Silva

* 2

* 3