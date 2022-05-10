
package eva3_6_try_catch_zero;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EVA3_6_TRY_CATCH_ZERO {

    
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
         }
    }
     
    
}
