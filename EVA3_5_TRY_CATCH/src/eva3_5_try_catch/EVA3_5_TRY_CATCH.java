
package eva3_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EVA3_5_TRY_CATCH {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca su edad (Numero entero): ");
        int iedad = 0 ;
       try{
            iedad = input.nextInt();
       }catch(InputMismatchException e){
           e.printStackTrace();
           System.out.println("Fallo la captura!!!");
       }
        System.out.println("Tu edad: " + iedad);
    }
    
}
