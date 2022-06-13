
package eva3_10_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EVA3_10_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner input = new Scanner(System.in);
        System.out.println("Introduce un dato erroneo");
        int valor = input.nextInt();
        System.out.println("El valor es " + valor);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }finally{
            System.out.println("ESTA LINEA SIEMPRE SE EJECUTARA");
        }
    }
    
}
