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

## 1. Clase `ejercicio2.SimuladorGestionRedes`

- En el método `main`, se inicia la ejecución del programa.
- Se llama a `obtenerConfiguracionUsuario()` para solicitar al usuario la configuración de la red.
- Luego, se llama a `simularRed` para realizar la simulación con la configuración proporcionada.

## 2. Clase `ejercicio2.ConfiguracionRed`

- Almacena la configuración de la red, como el número de routers y switches.
- Se crea a partir de los datos ingresados por el usuario en `obtenerConfiguracionUsuario()`.

## 3. Clase `ejercicio2.Red`

- Representa la red de computadoras según la configuración proporcionada.
- Se crea a partir de una instancia de `ejercicio2.ConfiguracionRed`.
- Ofrece un método `getNumNodos()` que devuelve el número total de nodos en la red (suma de routers y switches).

## 4. Clase `ejercicio2.TraficoRed`

- Representa el tráfico entre nodos de la red.
- La matriz `matrizTrafico` almacena valores aleatorios de tráfico entre nodos.
- Se utiliza en el método `simularTrafico()` para simular el tráfico en la red.

## 5. Clase `ejercicio2.CuellosDeBotella`

- Representa un cuello de botella entre dos nodos en la red.
- Se crea en el método `identificarCuellosDeBotella()` basándose en el análisis de la matriz de tráfico.

## 6. Funciones del programa

- `obtenerConfiguracionUsuario()`: Solicita al usuario el número de routers, switches y otros datos necesarios para configurar la red. Devuelve un objeto `ejercicio2.ConfiguracionRed`.
- `simularRed(ejercicio2.ConfiguracionRed configuracion)`: Crea una instancia de `ejercicio2.Red` basada en la configuración, simula el tráfico y busca cuellos de botella. Luego, muestra los resultados.
- `simularTrafico(ejercicio2.Red red)`: Simula el tráfico entre nodos en la red y devuelve un objeto `ejercicio2.TraficoRed`.
- `identificarCuellosDeBotella(ejercicio2.TraficoRed trafico)`: Analiza la matriz de tráfico y devuelve un objeto `ejercicio2.CuellosDeBotella` que representa el cuello de botella detectado.
- `mostrarResultados(ejercicio2.CuellosDeBotella cuellosDeBotella)`: Muestra los resultados de la simulación, específicamente el cuello de botella detectado.

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

# Ejercicio 3: Análisis de Tendencias en Datos de Redes Sociales

Este código Java implementa un sistema simple para analizar tendencias en datos de redes sociales, utilizando la biblioteca Twitter4J para obtener tweets de Twitter y realizar un análisis básico de tendencias. Aquí está la explicación paso a paso:

## 1. Configuración de credenciales

- Se definen constantes para las credenciales de la API de Twitter (`CONSUMER_KEY`, `CONSUMER_SECRET`, `ACCESS_TOKEN`, `ACCESS_TOKEN_SECRET`).

## 2. Método principal (`main`)

- Invoca el método `obtenerDatosRedesSociales` para obtener una lista de tweets.
- Luego, pasa esos datos al método `analizarTendencias` para identificar y mostrar las tendencias.

## 3. Método `obtenerDatosRedesSociales`

- Configura las credenciales de Twitter utilizando la clase `ConfigurationBuilder`.
- Crea una instancia de la clase `Twitter` utilizando una fábrica (`TwitterFactory`).
- Realiza una búsqueda de tweets con un hashtag específico (#Java en este caso).
- Recorre los resultados y agrega el texto de cada tweet a una lista.

## 4. Método `analizarTendencias`

- Invoca el método `identificarTendencias` para contar las ocurrencias de cada palabra que comienza con '#' en los datos obtenidos.
- Imprime las tendencias identificadas junto con el número de apariciones.

## 5. Método `identificarTendencias`

- Cuenta el número de ocurrencias de cada palabra que comienza con '#' en los datos proporcionados.
- Utiliza un `HashMap` para almacenar las tendencias y sus respectivas frecuencias.

En resumen, el código realiza una búsqueda de tweets con un hashtag específico, cuenta las ocurrencias de cada tendencia y muestra el resultado. Este es un ejemplo básico y podría mejorarse según las necesidades específicas, como manejar más detalles de los tweets, filtrar por fechas, o incorporar análisis más avanzados.

# Pseudocódigo

```java
función analizarTendencias(datos):
    tendencias = identificarTendencias(datos)
    para cada tendencia en tendencias:
        imprimir("Tendencia: ", tendencia)

datos = obtenerDatosRedesSociales()
analizarTendencias(datos)
```

# Ejercicio 4: Desarrollo de un Asistente Virtual Inteligente

Este programa en Java es un asistente virtual simple que puede interactuar con los usuarios a través de la consola. Aquí tienes una explicación sin el código:

## 1. Inicio del Programa

La clase principal se llama `ejercicio4.AsistenteVirtual`. Al ejecutar el programa, se inicia un bucle infinito en el método `main`.

## 2. Interacción con el Usuario

La función `interactuarConUsuario` solicita al usuario que ingrese una solicitud y luego procesa esa solicitud llamando a la función `procesarSolicitud`.

## 3. Procesamiento de Solicitud

La función `procesarSolicitud` verifica la solicitud del usuario y responde en consecuencia. Si la solicitud contiene "hola", responde con un saludo. Si contiene "recordatorio", llama a la función `establecerRecordatorio` para procesar y establecer un recordatorio.

## 4. Establecer Recordatorio

La función `establecerRecordatorio` extrae la hora y la tarea de la solicitud del usuario. Luego, crea un objeto `Recordatorio` con esta información y lo agrega a una lista llamada `listaRecordatorios`. La función devuelve un mensaje confirmando que se estableció el recordatorio.

## 5. Clase `Recordatorio`

Se define una clase interna llamada `Recordatorio` que tiene dos atributos: `hora` (de tipo `Calendar`) y `tarea` (de tipo `String`). Esta clase se utiliza para representar un recordatorio con una hora específica y una tarea asociada.

En resumen, el programa simula la interacción de un asistente virtual que puede saludar al usuario y establecer recordatorios basados en las solicitudes proporcionadas por el usuario. La lógica del recordatorio es simple y puede mejorarse según las necesidades específicas del sistema.

# Pseudocódigo

```java
función interactuarConUsuario():
    solicitud = obtenerSolicitudUsuario()
    respuesta = procesarSolicitud(solicitud)
    imprimir("Asistente: ", respuesta)

mientras verdadero:
    interactuarConUsuario()
```


# Ejercicio 5: Sistema de Monitoreo Ambiental con IoT

Este código Java implementa un sistema de monitoreo ambiental utilizando dispositivos IoT (Internet de las Cosas). A continuación, se proporciona una explicación detallada de cada parte del código:

## 1. Definición de la Clase `SistemaMonitoreoAmbiental`

- La clase `SistemaMonitoreoAmbiental` contiene toda la lógica del sistema de monitoreo ambiental.
- Dentro de esta clase, hay una clase interna llamada `DispositivoIoT`, que representa los datos de un dispositivo IoT. Cada dispositivo tiene un nombre, temperatura, humedad y calidad del aire.

## 2. Función `recolectarDatos`

- Es una función estática que recibe una lista de dispositivos IoT y devuelve una lista de datos simulados.
- La función simula la recolección de datos generando valores aleatorios para temperatura, humedad y calidad del aire de cada dispositivo.

## 3. Función `mostrarInterfazUsuario`

- Es una función estática que recibe una lista de datos de dispositivos IoT y muestra la información en la consola.
- En este ejemplo, la información se imprime en la consola con detalles como el nombre del dispositivo, temperatura, humedad y calidad del aire.

## 4. Función `monitorearAmbiente`

- Es una función estática que toma una lista de dispositivos IoT, llama a la función `recolectarDatos` para obtener datos simulados y luego muestra estos datos utilizando la función `mostrarInterfazUsuario`.

## 5. Función `obtenerDispositivosIoT`

- Es una función no estática que crea y devuelve una lista de dispositivos IoT predefinidos con nombres y valores iniciales de temperatura, humedad y calidad del aire.

## 6. Método `main`

- El método `main` es el punto de entrada del programa. Sin embargo, hay un pequeño error, ya que debería ser un método estático (`public static void main(String[] args)`) para ser el punto de entrada válido.
- En el método `main`, se obtienen los dispositivos IoT mediante la función `obtenerDispositivosIoT` y luego se llama a `monitorearAmbiente` para simular el monitoreo del ambiente.

En resumen, este código Java simula un sistema simple de monitoreo ambiental que utiliza dispositivos IoT para recolectar datos de temperatura, humedad y calidad del aire, y luego muestra estos datos en la consola.

# Pseudocódigo

```java
función monitorearAmbiente(dispositivos):
    datos = recolectarDatos(dispositivos)
    mostrarInterfazUsuario(datos)

dispositivos = obtenerDispositivosIoT()
monitorearAmbiente(dispositivos)

```


# Ejercicio 6: Algoritmo de Detección de Fraude

Este código Java simula un sistema simple de detección de fraudes en transacciones financieras. Aquí hay una descripción del código:

## 1. Clase `Transaccion`

- Representa una transacción financiera con diferentes atributos como `fraudu` (indicando si es fraudulenta), `id` (identificador único), `importe` (cantidad de dinero involucrada en la transacción), `concepto` (descripción de la transacción), `idOd` (identificador del origen) e `idBe` (identificador del beneficiario).
- Contiene métodos para marcar una transacción como fraudulenta (`marcarComoFraudulenta()`) y para obtener el estado de fraude (`getFraudu()`).

## 2. Clase `Transacciones`

- Representa una colección de transacciones (`ArrayList<Transaccion>`).
- Tiene métodos para agregar transacciones (`addTransaccion()`) tanto creando una nueva transacción como añadiendo una transacción ya existente.

## 3. Clase `GeneradorTransaccionesAleatorias`

- Proporciona un método estático `generarColeccionTransacciones()` que genera y devuelve una colección de transacciones con valores aleatorios.

## 4. Clase `DetectorTransaccionesFraudulentas`

- Utiliza el generador de transacciones aleatorias para crear una colección de transacciones.
- Tiene un método `detectarFraude()` que itera sobre las transacciones y marca aquellas que son fraudulentas.

## 5. Clase `AlgoritmoDeteccionFraude`

- Contiene el método `main()` que crea una instancia de `Transacciones` utilizando el generador de transacciones aleatorias.

En resumen, el código simula un sistema simple de detección de fraudes que genera aleatoriamente un conjunto de transacciones, algunas de las cuales son marcadas como fraudulentas. Luego, el detector de fraudes examina estas transacciones y marca las fraudulentas.

# Pseudocódigo

```java
función detectarFraude(transacciones):
    para cada transacción en transacciones:
        si esFraudulenta(transacción):
            marcarComoFraudulenta(transacción)

transacciones = obtenerTransacciones()
detectarFraude(transacciones)
```


# Ejercicio 7: Generador de Citas Inspiradoras

Este código en Java implementa un programa que genera citas inspiradoras de forma aleatoria a partir de una lista predefinida de citas y autores. El programa permite a los usuarios obtener una nueva cita cada vez que lo soliciten. Aquí tienes una explicación detallada del código:

## 1. Clase:

- La clase principal se llama `GeneradorCitasInspiradoras`.

## 2. Importaciones:

- Se importan las clases necesarias del paquete `java.util`, como `ArrayList`, `Arrays`, `List`, `Random` y `Scanner`, para utilizar estructuras de datos y facilitar la entrada de datos.

## 3. Método `main`:

- Se define el método principal `main` que inicia la ejecución del programa.
- Se crea una lista llamada `citas` que contiene algunas citas inspiradoras junto con sus respectivos autores.
- Se utiliza un bucle `while (true)` para generar citas de forma continua.
- Dentro del bucle, se llama a la función `generarCita(citas)` para imprimir una cita inspiradora aleatoria.
- Luego, se llama a la función `esperarSolicitudNuevaCita()` para preguntar al usuario si desea otra cita.

## 4. Método `generarCita`:

- Este método toma una lista de citas como parámetro.
- Se utiliza un objeto `Random` para generar un índice aleatorio dentro del rango de la lista de citas.
- La cita correspondiente al índice generado se imprime en la consola.

## 5. Método `esperarSolicitudNuevaCita`:

- Este método utiliza un objeto `Scanner` para obtener la entrada del usuario.
- Pregunta al usuario si desea otra cita, esperando una respuesta "si" o "no" (en minúsculas).
- Si la respuesta no es "si", el programa imprime "¡Hasta luego!" y se cierra con `System.exit(0)`.

En resumen, el programa genera y muestra citas inspiradoras de forma continua, permitiendo al usuario obtener nuevas citas o salir del programa según su preferencia. La estructura modular del código facilita la comprensión y mantenimiento.

# Pseudocódigo

```java
función generarCita():
    cita = obtenerCitaAleatoria()
    imprimir("Cita Inspiradora: ", cita)

mientras verdadero:
    generarCita()
    esperarSolicitudNuevaCita()
```


# Ejercicio 8: Generador de Citas Inspiradoras con Contexto

Este código en Java implementa un generador de citas inspiradoras que permite al usuario seleccionar el estado de ánimo o contexto deseado para la cita. Aquí tienes una explicación detallada del código:

## 1. Declaración e Inicialización de Listas:

- Se crean dos listas, `citasMotivadoras` y `citasAnimadas`, que contienen citas inspiradoras asociadas a los estados de ánimo "motivadora" y "animada", respectivamente.

## 2. Bucle Principal (`while (true) { ... }`):

- Se establece un bucle infinito que permite al usuario obtener citas de forma continua.
- En cada iteración del bucle, se solicita al usuario que seleccione el estado de ánimo o contexto deseado para la cita, utilizando la entrada proporcionada mediante `Scanner`.

## 3. Switch Statement (`switch (estadoAnimo) { ... }`):

- Se utiliza un bloque `switch` para manejar la elección del usuario.
- Si el estado de ánimo es "motivadora", se llama a la función `generarCita` con la lista de citas motivadoras.
- Si el estado de ánimo es "animada", se llama a la función `generarCita` con la lista de citas animadas.
- En caso de una opción no válida, se imprime un mensaje indicando que la opción es inválida y se pide al usuario que lo intente de nuevo.

## 4. Método `generarCita`:

- Este método toma una lista de citas como parámetro.
- Utiliza un objeto `Random` para generar un índice aleatorio dentro del rango de la lista de citas.
- La cita correspondiente al índice generado se imprime en la consola.

## 5. Método `esperarSolicitudNuevaCita`:

- Este método utiliza un objeto `Scanner` para obtener la respuesta del usuario a la pregunta de si desea otra cita.
- La respuesta se convierte a mayúsculas con `toUpperCase()` para aceptar respuestas tanto en mayúsculas como en minúsculas.
- Si la respuesta no es "SI", se imprime "¡Hasta luego!" y el programa se cierra con `System.exit(0)`.

En resumen, el programa ofrece un menú interactivo que permite al usuario elegir entre citas motivadoras o animadas. Después de mostrar la cita seleccionada, se pregunta al usuario si desea obtener otra cita o salir del programa. La estructura modular y el uso de listas facilitan la expansión del programa con nuevos estados de ánimo o categorías de citas.

# Pseudocódigo

```java
función generarCitaConContexto(contexto):
    cita = obtenerCitaPorContexto(contexto)
    imprimir("Cita Inspiradora: ", cita)

contexto = obtenerContextoUsuario()
generarCitaConContexto(contexto)
```


# Ejercicio 9: Validador de Expresiones Matemáticas

Este código Java se encarga de validar expresiones matemáticas ingresadas por el usuario en términos de sintaxis y paréntesis balanceados. A continuación, se presenta una explicación detallada del código:

## 1. Clase

El código contiene una clase principal llamada `ValidadorExpresionesMatematicas`.

## 2. Método Main

El método `main` es el punto de entrada del programa. Se crea un objeto `Scanner` para leer la entrada del usuario desde la consola. El usuario ingresa una expresión matemática, y luego se llama a la función `validarExpresion` para verificar su validez. Se imprime un mensaje indicando si la expresión es válida o no.

## 3. Función ValidarExpresion

La función `validarExpresion` utiliza dos funciones auxiliares, `comprobarSintaxis` y `verificarParentesisBalanceados`, para validar la sintaxis general y la correcta colocación de paréntesis en la expresión, respectivamente.

## 4. Función ComprobarSintaxis

La función `comprobarSintaxis` verifica si la expresión contiene solo caracteres válidos para una expresión matemática. Utiliza un bucle `for-each` para iterar sobre cada carácter de la expresión y verifica si está en la lista de caracteres válidos (números, operadores y paréntesis).

## 5. Función VerificarParentesisBalanceados

La función `verificarParentesisBalanceados` utiliza una pila (`Stack`) para rastrear la correcta colocación de los paréntesis en la expresión. Recorre cada carácter de la expresión y, si encuentra un paréntesis de apertura, lo apila. Si encuentra un paréntesis de cierre, verifica si el último paréntesis de apertura en la pila es su pareja correspondiente. La función devuelve `true` si los paréntesis están balanceados (la pila está vacía al final).

## 6. Función EsParValido

La función `esParValido` verifica si un paréntesis de apertura y uno de cierre son del mismo tipo (paréntesis, corchetes o llaves).

En resumen, este código proporciona una estructura básica para validar expresiones matemáticas, asegurándose de que la sintaxis general sea correcta y de que los paréntesis estén balanceados adecuadamente.

# Pseudocódigo

```java
función validarExpresión(expresión):
    es_valida = comprobarSintaxis(expresión)
    si es_valida:
        imprimir("La expresión es válida")
    si no:
        imprimir("La expresión no es válida")

expresión = obtenerExpresiónUsuario()
validarExpresión(expresión)
```
