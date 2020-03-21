
package refresh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author angel
 */
public class Refresh {

    public static void main(String[] args) {
        ReadFile r = new ReadFile();
        WriteFile w = new WriteFile();
        ReadFileBuffer rf = new ReadFileBuffer();
        WriteFileBuffer wb = new WriteFileBuffer();
        NoBinariosRead bin = new NoBinariosRead();
        
        System.out.println(bin.read());
        //rf.read();
        //wb.write();
        //rf.read();
    }
    
}


//Leer archivo usando FileReader
class ReadFile{
    
    public void read(){
        
        try {
            
            FileReader input = new FileReader("file.txt");
            
            //almacenar en un bloque el archivo de caracteres
            BufferedReader br = new BufferedReader(input);
            
            //read unicode of each character on this example
            //int c = input.read(); //read returs -1 at the end of file
            int c = 0;
            
            while(c != -1){
                c = input.read();
                
                char letra = (char)c;
                
                //System.out.println(c); //print unicode
                System.out.print(letra);
            }
            
            input.close();
            
        } catch (IOException ex) {
            System.out.println("No existe el archivo");
        }
    }
}

//Leer archivo usando Buffered Reader
class ReadFileBuffer{
    
    public void read(){
        
        try {
            
            FileReader input = new FileReader("file.txt");
            
            //almacenar en un bloque el archivo de caracteres
            BufferedReader br = new BufferedReader(input);
            
            String linea = "";
            
            while(linea != null){
                linea = br.readLine();
                if (linea != null)
                    System.out.print(linea);
            }
            
            input.close();
            
        } catch (IOException ex) {
            System.out.println("No existe el archivo");
        }
    }
}



class WriteFile{
    
    public void write(){
        
        String myString = "my text: Hallo Welt!";
        
        try {
            FileWriter output = new FileWriter("file.txt");
            
            for (int i = 0; i < myString.length(); i++) {
                output.write(myString.charAt(i));
                
            }
            
            output.close();
            
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

class WriteFileBuffer{
    
    public void write(){
        
        String myString = "it's me again\n";
        
        try {
            FileWriter output = new FileWriter("file.txt", true);
            BufferedWriter bw = new BufferedWriter(output);
            
            output.write(myString);
            
            output.close();
            
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

class NoBinariosRead{
    public int read(){
        
        int contador = 0;
        
        int datos_entrada[] = new int[35];
        
        try {
            FileInputStream leer = new FileInputStream("file.txt");
            
            boolean final_archivo = false;
            
            while(!final_archivo){
                int byte_entrada = leer.read();
                
                if(byte_entrada == -1)
                    datos_entrada[contador] = byte_entrada;
                else
                    final_archivo = true;
                
                //System.out.println(byte_entrada);
                System.out.println(datos_entrada[contador]);
                contador++;
            }
            leer.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NoBinariosRead.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NoBinariosRead.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return contador;
    }
}

class NoBinariosWrite{
    
    public void write(){
        
        try {
            
            FileOutputStream file = new FileOutputStream("fileBin.txt");
            
            file.write(123);
            
            file.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NoBinariosWrite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NoBinariosWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}