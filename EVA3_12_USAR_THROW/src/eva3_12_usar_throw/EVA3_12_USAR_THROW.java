
package eva3_12_usar_throw;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EVA3_12_USAR_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad(Valor entero positivo) : ");
        int valor = input.nextInt();
        if(valor < 0){
            throw new Excetion("El valo = " + valor + "No es una edad valida");
        }
        }catch(Exception e){
            
        }
        
        System.out.println("Edad guardada es " + valor);
    }
    
}
