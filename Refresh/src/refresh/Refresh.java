
package refresh;

import java.io.FileNotFoundException;
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
        
        r.read();
        w.write();
        r.read();
    }
    
}

class ReadFile{
    
    public void read(){
        
        try {
            
            FileReader input = new FileReader("file.txt");
            
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
