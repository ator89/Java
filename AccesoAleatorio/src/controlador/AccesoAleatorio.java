
package controlador;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import modelo.Persona;

/**
 *
 * @author angel
 */
public class AccesoAleatorio {
    
    private static RandomAccessFile flujo;
    private static int numeroRegistros; //datos de cuantas personas se han guardado
    private static int tamanioRegistro = 80;
    
    //crear un flujo sobre archivo determinado
    public static void crearFileAlumno(File archivo) throws IOException{
        if(archivo.exists() && !archivo.isFile()){
            throw new IOException(archivo.getName() + " no es un archivo");
        }
        flujo = new RandomAccessFile(archivo, "rw");
        numeroRegistros = (int)Math.ceil((double)flujo.length()/(double)tamanioRegistro);
    }
    
    public static void cerrar() throws IOException{
        flujo.close();
    }
    
    public static boolean setPersona(int i, Persona persona) throws IOException{
//        if(i => 0 && i <= getNumeroRegistros()){
//            if(persona.getTamanio() > tamanioRegistro){
//                System.out.println("Tamaño de registro excedido");
//            }else{
//                flujo.seek(i*tamanioRegistro);
//                flujo.writeUTF(persona.getNombre());
//                flujo.writeInt(persona.getEdad());
//                return true;
//            }
//        }else{
//            System.out.println("\nNúmero del registro está fuera de límites.");
//        }
        return false;
    }
    
    //agregar persona después de la última
    public static void agregarPersona(Persona persona) throws IOException{
        //si se guarda correctamente, se aumenta el número de registros
        if(setPersona(numeroRegistros, persona))
            numeroRegistros++;
    }
    
    public static int getNumeroRegistros(){
        return numeroRegistros;
    }
    
    public static Persona getPersona(int i) throws IOException {
        if(i >= 0 && i <= getNumeroRegistros()) {
            flujo.seek(i * tamanioRegistro);
            return new Persona(flujo.readUTF(), flujo.readInt(), flujo.readBoolean());
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
            return null;
        }
    }
}
