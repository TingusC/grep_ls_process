package es.etg.dam.psp;

import java.io.IOException;

public class Main {

    private static final String[] COMANDOS = {"ls", "grep"};
    private static final String RUTA = "/home/debian/Documents";
    private static final String PARAMETRO = "a";

    public static final String SALTOLINEA = "\n";
    public static final String SEPARADOR= " ";

    public static void main(String[] args) throws IOException {
        String[] comandosLs = GestorComandos.generar(COMANDOS[0], RUTA);
        Process ls = GestorProcesos.lanzar(comandosLs);
        String salidaLs = GestorProcesos.obtenerSalida(ls);

        String[] comandosGrep = GestorComandos.generar(COMANDOS[1], PARAMETRO);
        Process grep = GestorProcesos.lanzar(comandosGrep);
        GestorProcesos.enviarDatos(grep, separar(salidaLs));
        String salidaGrep = GestorProcesos.obtenerSalida(grep);
        System.out.println(salidaGrep);

    }

    public static String[] separar(String salida)
    {
        String[] ret = salida.split(SEPARADOR); 
        return  ret;
    }
}