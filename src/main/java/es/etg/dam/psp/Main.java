package es.etg.dam.psp;

import java.io.IOException;

public class Main {

    private static final String[] COMANDOS = {"ls", "grep"};
    private static final String RUTA = "/home/debian/Documents";
    private static final String PARAMETRO = "a";

    public static final String SALTOLINEA = "\n";
    public static final String SEPARADOR= " ";

    public static void main(String[] args) throws IOException {
        String ls = LanzadorProcesos.ejecutarLs(GestorComandos.generar(COMANDOS[0], RUTA));
        String grep = LanzadorProcesos.ejecutarGrep(GestorComandos.generar(COMANDOS[1], PARAMETRO), ls);
        System.out.println(grep);
    }
}