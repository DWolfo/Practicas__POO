/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_nullpointerexception;

/**
 *
 * @author Daniel
 */
public class EVA3_4_NULLPOINTEREXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = null;
        imprimir(persona);
        System.out.println("Nombre : " + persona.getNombre());
    }
    
    public static void imprimir(Persona perso) {
        System.out.println("Nombre: " + perso.getNombre);
    }
    
    public static void masComplicado(Persona perso) {
        masComplicado(perso);
    }
    
}
  class Persona{
            private String nombre;

            public Persona() {
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
        }