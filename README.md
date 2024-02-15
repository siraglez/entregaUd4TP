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

## Pseudocódigo

```java
función analizarComentarios(comentarios):
    para cada comentario en comentarios:
        sentimiento = determinarSentimiento(comentario)
        imprimir("Comentario: ", comentario, " - Sentimiento: ", sentimiento)

comentarios = obtenerComentarios()
analizarComentarios(comentarios)

```

# Ejercicio 2: Simulador de Gestión de Redes 

Este código Java implementa un simulador de gestión de redes. Aquí hay una explicación detallada:

## 1. Clase `SimuladorGestionRedes`

- En el método `main`, se inicia la ejecución del programa.
- Se llama a `obtenerConfiguracionUsuario()` para solicitar al usuario la configuración de la red.
- Luego, se llama a `simularRed` para realizar la simulación con la configuración proporcionada.

## 2. Clase `ConfiguracionRed`

- Almacena la configuración de la red, como el número de routers y switches.
- Se crea a partir de los datos ingresados por el usuario en `obtenerConfiguracionUsuario()`.

## 3. Clase `Red`

- Representa la red de computadoras según la configuración proporcionada.
- Se crea a partir de una instancia de `ConfiguracionRed`.
- Ofrece un método `getNumNodos()` que devuelve el número total de nodos en la red (suma de routers y switches).

## 4. Clase `TraficoRed`

- Representa el tráfico entre nodos de la red.
- La matriz `matrizTrafico` almacena valores aleatorios de tráfico entre nodos.
- Se utiliza en el método `simularTrafico()` para simular el tráfico en la red.

## 5. Clase `CuellosDeBotella`

- Representa un cuello de botella entre dos nodos en la red.
- Se crea en el método `identificarCuellosDeBotella()` basándose en el análisis de la matriz de tráfico.

## 6. Funciones del programa

- `obtenerConfiguracionUsuario()`: Solicita al usuario el número de routers, switches y otros datos necesarios para configurar la red. Devuelve un objeto `ConfiguracionRed`.
- `simularRed(ConfiguracionRed configuracion)`: Crea una instancia de `Red` basada en la configuración, simula el tráfico y busca cuellos de botella. Luego, muestra los resultados.
- `simularTrafico(Red red)`: Simula el tráfico entre nodos en la red y devuelve un objeto `TraficoRed`.
- `identificarCuellosDeBotella(TraficoRed trafico)`: Analiza la matriz de tráfico y devuelve un objeto `CuellosDeBotella` que representa el cuello de botella detectado.
- `mostrarResultados(CuellosDeBotella cuellosDeBotella)`: Muestra los resultados de la simulación, específicamente el cuello de botella detectado.

En resumen, este programa solicita al usuario la configuración de una red, simula el tráfico en la red y muestra los posibles cuellos de botella. La simulación es básica y utiliza valores aleatorios para el tráfico entre nodos.

# Pseudocódigo

```java
función simularRed(configuración):
    red = crearRed(configuración)
    tráfico = simularTráfico(red)
    cuellos_de_botella = identificarCuellosDeBotella(tráfico)
    mostrarResultados(cuellos_de_botella)

configuración = obtenerConfiguraciónUsuario()
simularRed(configuración)
```
