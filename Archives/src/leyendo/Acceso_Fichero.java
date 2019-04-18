
package leyendo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class Acceso_Fichero {
    
    public static void main(String[] args){
        Leer_Fichero acceder = new Leer_Fichero();
        acceder.lee();
    }
    
}

class Leer_Fichero{
    public void lee(){
        
        try {
            //Constructor de FileReader() lanza excepción de FileNotFoundException
            FileReader entrada = new FileReader("file.txt"); //No olvidar cerrar el archivo
            
            int c = entrada.read();
            
            //repetir mientras no se llegue al final del archivo
            while(c != -1){
                c = entrada.read();
                
                char letra = (char)c;
                
                System.out.print(letra);
            }
            
            
            entrada.close(); // cerrar el flujo
            
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}