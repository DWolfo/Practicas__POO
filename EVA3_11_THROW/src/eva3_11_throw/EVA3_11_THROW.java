
package eva3_11_throw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class EVA3_11_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            throw new Exception("Mi exception");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
