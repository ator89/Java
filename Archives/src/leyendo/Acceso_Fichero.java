
package leyendo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class Acceso_Fichero {
    
    public static void main(String[] args){
        
    }
    
}

class Leer_Fichero{
    public void lee(){
        
        try {
            //Constructor de FileReader lanza excepción de FileNotFoundException
            FileReader entrada = new FileReader("/file.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        }
    }
}