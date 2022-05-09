
package eva3_3_division_cero;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EVA3_3_DIVISION_CERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad(Numero entero): ");
       
        System.out.println("Introduce un numero entero : ");
         int entero = sc.nextInt();
        
        
        System.out.println("Introduce otro numero entero : ");
         int entero2 = sc.nextInt();
         
         System.out.println("Division : "  + (entero/entero2));
        
      
    }
    
}
