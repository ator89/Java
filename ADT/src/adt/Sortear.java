/*
 * Sorting methods
 */
package adt;

/**
 *
 * @author angel
 */
public class Sortear {
    private int array[];
    private int size;

    public Sortear() {
        array = null;
        size = 0;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    
    void bubble(int[] array, int size){
        for(int i = 0; i < size-1; i++){
            for(int j = 0; j < size-2; j++){
                if(array[j]>array[j+1]){
                    //swap(array[j],array[j+1]);
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = array[j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
            
        }
    }
    
    
    
}
