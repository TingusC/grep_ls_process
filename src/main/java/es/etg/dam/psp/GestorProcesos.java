package es.etg.dam.psp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class GestorProcesos {

    
    
    public static Process lanzar(String[] comando) throws IOException
    {
        Process ret = Runtime.getRuntime().exec(comando);

        return ret;
    }

    public static void enviarDatos(Process proceso, String[] datos) throws IOException
    {
        OutputStream out = proceso.getOutputStream();
        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(out))) {
            for(String dato : datos)
            {
                writer.write(dato + Main.SALTOLINEA);
            }
        }
    }

    public static String obtenerSalida(Process process) throws IOException
    {
        
        String ret = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String linea;
            while((linea = reader.readLine()) != null)
            {
                ret += linea + Main.SEPARADOR;
            }
        }
        return ret;
    }
}
