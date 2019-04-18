/*
 * Implementación de la clase Pila
 */
package adt;

/**
 *
 * @author angel
 */
public class Pila {
    
    private NodoP top;

    public Pila() {
        this.top = null;
    }
    
    boolean isEmpty(){
        if(this.top == null )
            return true;
        return false;
    }
    
    int top(){
        if(isEmpty()){
            return -1;
        }
        return this.top.getData();
    }
    
    void push(int x){
        NodoP temp = new NodoP();
        temp.setData(x);
        temp.setTop(this.top);
        this.top = temp;
    }
    
    void pop(){
        NodoP temp = top;
        if(isEmpty())
            return;
        top = temp.getTop();
        temp.setTop(top);
        
    }
    
}
