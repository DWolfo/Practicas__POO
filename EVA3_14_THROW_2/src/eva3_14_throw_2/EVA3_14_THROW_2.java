/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_14_throw_2;

/**
 *
 * @author Daniel
 */
public class EVA3_14_THROW_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        persona.setNombre("Sebastian Balderrama Urbina");
        try {
            persona.setEdad(-1);
        }catch (Exception ex) {
            
        }
    }
    
}

class Persona{
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre, int edad) throws Exception {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if((edad >= 0) && (edad <= 130))
        this.edad = edad;
        else
            try{
                throw new Exception("Rango de edad incorrecto!!");
            } catch (Exception ex) {
                ex,printStackTrace();
            }
            
    }
}