/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_clases;

/**
 *
 * @author Daniel
 */
public class EVA1_11_Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        class Persona {

    //ATRIBUTOS DE LA CLASE
    private String id;
    private String nombre;
    private int edad;

    public String getId() {
        return id;
    }

    //this --> este
    //apuntador --> al objeto actual
    public void setId(String id) {
        this.id = id;
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

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
    }
    
}
