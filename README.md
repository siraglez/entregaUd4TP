Link al repositorio: https://github.com/siraglez/entregaUd4TP.git
# Ejercicio 1: Sistema de Análisis de Sentimientos en Comentarios

Este código en Java utiliza la biblioteca Stanford NLP para realizar un análisis de sentimientos en un conjunto de comentarios. A continuación, se presenta un resumen de las funciones principales:

## 1. Importaciones
Se importan las clases necesarias de la biblioteca Stanford NLP para el procesamiento del lenguaje natural y el análisis de sentimientos.

## 2. Método `main`
En este método, se obtienen los comentarios llamando a un método específico y luego se llama a otro método para analizar esos comentarios.

## 3. Método `obtenerComentarios`
Este método proporciona una lista de comentarios de ejemplo. En una aplicación real, podría obtener comentarios de una fuente de datos como una base de datos o un archivo.

## 4. Método `analizarComentarios`
Aquí se configura un pipeline básico de Stanford NLP para analizar el sentimiento de los comentarios. Para cada comentario, se crea una anotación, se ejecuta el pipeline y se obtiene el sentimiento. Finalmente, se imprime el comentario junto con su sentimiento.

## 5. Método `obtenerSentimiento`
Este método extrae el sentimiento de la primera oración de un comentario. Si no hay oraciones, devuelve un mensaje indicando que no se pudo determinar el sentimiento.

En resumen, el código realiza un análisis de sentimientos en un conjunto de comentarios utilizando la biblioteca Stanford NLP. Cada comentario es procesado para determinar si tiene un sentimiento positivo, negativo o neutral, y el resultado se imprime en la consola.

