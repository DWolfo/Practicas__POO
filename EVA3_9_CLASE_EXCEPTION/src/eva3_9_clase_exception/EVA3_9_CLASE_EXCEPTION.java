
package eva3_9_clase_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EVA3_9_CLASE_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
       
        System.out.println("Introduce un numero entero : ");
         int entero = sc.nextInt();
        
        
        System.out.println("Introduce otro numero entero : ");
         int entero2 = sc.nextInt();
         
         try{
              System.out.println("Division : "  + (entero/entero2));  
         }catch(ArithmeticException miVariable){
             System.out.println("Se produjo un error");
         }catch(Exception e){
             System.out.println("El valor capturado no es valido");
         }
             System.out.println("FIN DEL PROGRAMA");
    }
    
}
