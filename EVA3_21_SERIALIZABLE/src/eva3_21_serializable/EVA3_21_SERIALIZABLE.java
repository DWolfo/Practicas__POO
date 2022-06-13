
package eva3_21_serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class EVA3_21_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    public static void escribirObj(Object obj){
        try{
            FileOutputStream abrirArch = new FileOutputStream("c:/archivos.Archivo.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
        }catch{
            
        }
    }
    
}

class Persona implements Serializable{

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona() {
    }
        private String nombre;
        private String apellido;
}