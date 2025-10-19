package es.etg.dam.psp;

import java.io.IOException;

public class LanzadorProcesos {
    
    public static String ejecutarLs(String[] comandos) throws IOException
    {
        Process process = GestorProcesos.lanzar(comandos);
        String salida = GestorProcesos.obtenerSalida(process);

        return salida;
    }

    public static String ejecutarGrep(String[] comandos, String datos) throws IOException
    {
        Process process = GestorProcesos.lanzar(comandos);
        GestorProcesos.enviarDatos(process, GestorComandos.separar(datos));
        String salida = GestorProcesos.obtenerSalida(process);

        return salida;
    }
}
