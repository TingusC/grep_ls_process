package es.etg.dam.psp;

public class GestorComandos {
    
    public static String[] generar(String comando, String parametro)
    {
        String[] ret = {comando, parametro};

        return ret;
    }

    public static String[] separar(String salida)
    {
        String[] ret = salida.split(Main.SEPARADOR); 
        return  ret;
    }
}
