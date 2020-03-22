
package rafe;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author angel
 */
public class RandomAccessFileExample {
    
    static final String FILE = "data.txt";
    
    public static void main(String args[]){
        try {
            System.out.println(new String(readSomeDataFromeFile(FILE,10,15)));
            writeDataToFile(FILE, "Java Rocks", 5);
        } catch (Exception e) {
            System.out.println("Oops, ERROR");
        }
    }
    
    public static byte[] readSomeDataFromeFile(String file, int pos, int size) throws IOException{
        RandomAccessFile fileAF = new RandomAccessFile(file, "r");
        fileAF.seek(pos);
        byte[] bytesToRead = new byte[size];
        fileAF.read(bytesToRead);
        fileAF.close();
        return bytesToRead;
    }
    
    private static void writeDataToFile(String file, String data, int pos) throws IOException{
        RandomAccessFile fileAF = new RandomAccessFile(file, "rw");
        fileAF.seek(pos);
        fileAF.write(data.getBytes());
        fileAF.close();
    }
    
}
