/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_18_archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Daniel
 */
public class EVA3_18_ARCHIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
            // TODO code application logic here
            FileInputStream archivo = new FileInputStream("C:/ARCHIVOS PRACTICAS JAVA/HOla.txt");
            int leer = archivo.read();
            do{
            System.out.print((char)leer);
            leer = archivo.read();
            }while(leer != -1);
           
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
           ex.printStackTrace();
    
        }
    }
    
}
