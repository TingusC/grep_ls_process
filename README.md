# Ejercicio procesos ls + grep

**Repositorio Github:** https://github.com/TingusC/grep_ls_process

### Enunciado:

>Cree un programa que:

1. Lance un proceso que ejecute el comando "LS"
1. Utilice en un proceso para procesar la salida del comando LS y obtener las entradas que tengan una "a" (comando grep)
1. Muestre la salida por la consola.

### Explicación del código:

Como el enunciado pide el programa ejecuta el comando *ls* sobre una ruta, este caso *"/home/debian/documents"*, y filtra los resutados usando el comando *grep* y los muestra por pantalla. 

El prorama utiliza Tres clases:

### Clases:

**GstorComandos:**

Es el encargado de preparar los comandos y parametros que recibiran y tartaran otras. Tiene dos metodos:

- *generar()*: Une el comando con el parametro que se le aplicara.

- *separar()*: Separa las salidas de los procesos de *String* a array de String (*String[]*).

**GestorProcesos**

Es el encargado de ejecutar los procesos, recoger sus salidas y enviarles datos extra a los mismos. Tiene tres metodos:

- *lanzar()*: Lanza el proceso con el comando recogido en un array de String (*String[]*).

- *obtenerSalida()*: Recoge la salida del proceso y la devuelve en forma de *String*.

- *enviarDatos()*: Envia datos al proceso ya en ejecución mediante un array de String (*String[]*).

**LanzadorProcesos**

Utiliza el GestorProcesos para ejecutar los comandos deseados. Esta solamente pensado para lanzar *ls* y *grep*. Sus dos metodos son exactamente esos:

- *ejecutarLs()*

- *ejecutarGrep()*

### Notas:

- He intentado seccionar el codigo lo maximo posible para facilitar su lectura y seguimiento.

- No se han creado pruebas de JUnit. Pendientes.

- El lanzador de procesos deberia ser mas generico para poder utilizar el prorama con diferentes comandos. Lo intentare cambiar antes de la entrega si encuentro la manera.