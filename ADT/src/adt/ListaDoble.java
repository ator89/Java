/*
 *
 */
package adt;

/**
 *
 * @author angel
 */
public class ListaDoble {
    private NodoDL head;

    public ListaDoble() {
        head = null;
    }
    
    void insert(int x){
        NodoDL temp = new NodoDL();
        temp.setData(x);
        temp.setNext(null);
        temp.setPrev(null);
        if( head == null ){
            head = temp;
            return;
        }
        head.setPrev(temp);
        temp.setNext(head);
        head = temp;
        
    }
    
    void show(){
        NodoDL temp = this.head;
        while (temp != null){
            System.out.println(" " + temp.getData());
            temp = temp.getNext();
        }
        System.out.println("\n");
    }
    
    
}
