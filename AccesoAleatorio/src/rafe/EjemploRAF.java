
package rafe;

import java.io.RandomAccessFile;

/**
 *
 * @author angel
 */
public class EjemploRAF {
    
    public static void main(String args[]){
        
        RandomAccessFile xFileAleatorio;
    
        String strCodigo = "4321";          //4 chars
        String strNombre = "AngXl Trrs";    //10 chars
        String strEdad = "32";              //2 chars
        String strPeso = "75.80";           //5 chars
        String strActivo = " ";             //1 chars
        String strEOL = "\n";               //1 char
        int iLongitud = 23;                 //23 longitud del registro
        
        try{
            //Crear acceso directo al archivo
            xFileAleatorio = new RandomAccessFile("data.txt","rw");
            
            //desplegar su longitud
            System.out.println("Longitud del archivo: " + xFileAleatorio.length());
            System.out.println("Registros del Archivo: " + xFileAleatorio.length()/23 );
            
            //Ir al final del fichero
            //xFileAleatorio.seek(xFileAleatorio.length());
            
            //ir al inicio del archivo
            //xFileAleatorio.seek(0);
            
            //Ir a un registro en específico y modificar el registro
            int iRegistro = 3;
            
            xFileAleatorio.seek((iRegistro-1)*iLongitud);
            
            //Escribir la cadena al archivo;
            xFileAleatorio.writeBytes(strCodigo);
            xFileAleatorio.writeBytes(strNombre);
            xFileAleatorio.writeBytes(strEdad);
            xFileAleatorio.writeBytes(strPeso);
            xFileAleatorio.writeBytes(strActivo);
            xFileAleatorio.writeBytes(strEOL);
            
            //Mensaje de confirmación
            System.out.println("Se ha ingresado un registro en el archivo");
            
            //Cerrar el archivo
            xFileAleatorio.close();
            
        }catch(Exception e){
            
        }
    }
    
}
