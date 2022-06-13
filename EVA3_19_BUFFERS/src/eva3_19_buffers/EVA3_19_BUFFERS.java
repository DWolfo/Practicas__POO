/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_19_buffers;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;

/**
 *
 * @author Daniel
 */
public class EVA3_19_BUFFERS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definir la ruta
        Path ruta = Paths.get("c:/Archivo/Archivo,txt");
        //Abrimos el archivo
        InputStream abrirArch;
        //Leemos el archivo
        InputStreamReader leerArch;
        //CONVERTIMOS BYTES A CARACTERES
        BufferedReader leerTexto;
    }
    
}
