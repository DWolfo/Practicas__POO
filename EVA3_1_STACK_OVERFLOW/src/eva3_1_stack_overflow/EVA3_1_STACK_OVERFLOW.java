
package eva3_1_stack_overflow;

/**
 *
 * @author Daniel
 */
public class EVA3_1_STACK_OVERFLOW {

    /**
     * @param args the command line arguments
     */
    public static int cont = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        terminarStack();
       } 
                
                
                
    //Stack es la memoria para variables locales y llamadas a funciones
    public static void terminarStack(){
        
        cont = cont + 1;
        System.out.println(cont);
        terminarStack();
    }
}
