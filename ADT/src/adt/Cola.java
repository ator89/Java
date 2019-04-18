/*
 * Implementación de Cola
 */
package adt;

/**
 *
 * @author angel
 */
public class Cola {
    
    private NodoQ front, rear;

    public Cola() {
        this.front = null;
        this.rear = null;
    }

    
    //Enqueue
    void enqueue(int x){
        NodoQ temp = new NodoQ();
        temp.setData(x);
        temp.setLink(null);
        if( this.front == null && this.rear == null){
            front = rear = temp;
            return;
        }
        rear.setLink(temp);
        rear = temp;
    }
    
    //Dequeue
    void dequeue(){
        NodoQ temp = front;
        front = temp.getLink();
    }
    
    int front(){
       return front.getData();
    }
    
    //Print
    void show(){
        
    }
    
    
}
