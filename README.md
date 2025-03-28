# Gestor de Archivos Integrado (FileManager)

Aplicación de gestión de archivos integrada al sistema operativo. Permite la navegación y manipulación de archivos y directorios, incluyendo listado recursivo, reconocimiento de extensiones, operaciones de visualización, eliminación recursiva, y apertura de archivos/directorios filtrados.

**Tecnologías Utilizadas:** Java, Swing.

## Funcionalidades principales

* **Exploración de rutas:**
    * Permite ingresar una ruta en el sistema para explorar su contenido.
* **Filtrado de archivos:**
    * Implementa el filtrado de archivos similar al comando `ls` en Linux, mostrando subdirectorios y archivos de forma estructurada.
* **Eliminación de elementos:**
    * Permite la eliminación de archivos y directorios.
    * Si se elimina un directorio, se elimina de forma recursiva (contenido y directorio).
* **Apertura directa:**
    * Al explorar una ruta, se abre una subventana con opciones para abrir la ruta directamente en el sistema operativo.

## Estructura del repositorio

* `src`: Contiene el código fuente del FileManager
* `executable`: Contiene el archivo ejecutable `FileManager.jar`

## Requisitos previos
1.  **Java:** Descarga e instala el JDK o JRE (versión >= 17) desde [Oracle](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) .

## Ejecución
1.  **Clonar el repositorio:**
    ```bash
    git clone https://github.com/uranium092/FileManager
    ```
2. **Ir al ejecutable `.jar`:** Navega a `executable` y ejecuta `FileManager.jar` dando click sobre él o ejecutando `java -jar FileManager.jar`

## Recomendaciones
## Recomendaciones

* **Precaución al eliminar:** Tenga especial cuidado al utilizar la función de eliminación. Los archivos borrados no se pueden recuperar, ya que la aplicación no realiza copias de seguridad ni utiliza una papelera de reciclaje.
* **Filtrado en directorios grandes:** Evite utilizar la función de filtrado en directorios con una gran cantidad de archivos y subdirectorios. Esto podría afectar el rendimiento.
