
package RandomAF;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author angel
 */
public class exe {
    
    static RandomAccessFile archivo;
    
    static void escribir(String nombre, int edad, char sexo) throws IOException{
        archivo.seek(archivo.length());//posicionar el puntero al final del archivo
        archivo.writeUTF(nombre);
        archivo.writeInt(edad);
        archivo.writeChar(sexo);
    }
    
    static boolean buscarPersona(String nombre) throws IOException{
        
        archivo.seek(0);
        
        while(archivo.getFilePointer() < archivo.length()){
            if(archivo.readUTF().equals(nombre)){
                
                //archivo.readInt();
                //archivo.readChar();
                archivo.skipBytes(6);
                
                return true;
                
            }
        }
        
        return false;
    }
    
    static void imprimir() throws IOException{
        archivo.seek(0);
        
        while( archivo.getFilePointer() < archivo.length() ){
            System.out.println(archivo.readUTF());
            System.out.println(archivo.readInt());
            System.out.println(archivo.readChar());
        }
    }
    
    public static void main(String args[]){
        
        try {
            
            archivo = new RandomAccessFile("Personas", "rw");
            
        } catch (Exception e) {
        
        }
        
    }
    
}
