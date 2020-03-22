
package modelo;

import java.io.Serializable;

/**
 *
 * @author angel
 */
public class Persona implements Serializable{
    
    private String nombre; // 2 bytes
    private int edad; // 4 bytes
    private boolean activo;
    
    public Persona(){
        nombre = "NN";
        edad = 0;
        activo = true;
    }

    public Persona(String nombre, int edad, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.activo = activo;
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
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + 
                "\nEdad: " + edad;
    }   
    
    public int getTamanio() {
        return getNombre().length()*2 + 2 + 4 + 1;
    }
    
    
}
