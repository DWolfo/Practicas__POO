
package eva3_17_exceptionrango;

/**
 *
 * @author Daniel
 */
public class EVA3_17_ExceptionRango {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
    Persona persona=new Persona("Juan Perez",-150);
    } catch (ExcepcionDeRango ex) {
        }
    }
    
}
class ExcepcionDeRango extends Exception{

    public ExcepcionDeRango() {
    }

    public ExcepcionDeRango(String message) {
        super(message);
    }
    
}
class Persona{
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) throws ExcepcionDeRango {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ExcepcionDeRango{ 
        if((edad >=0) && (edad<= 130))
        this.edad = edad;
        else
            throw new ExcepcionDeRango("Edad0 invalida");
    }
    
}
