
package eva3_13_mejorar_capturar_edad;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EVA3_13_MEJORAR_CAPTURAR_EDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean datoErroneo = true;//Dato erroneo
       do{
            Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad(Numero entero): ");
        try{
                    int iedad = input.nextInt();
                    System.out.println("Tu edad: " + iedad);
                    datoErroneo = false;
        }catch(InputMismatchException e){
            System.out.println(input.next() + "No es valido");
            
        }
        }while(datoErroneo);
    }
    
}
