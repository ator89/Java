/*
 * Clase para lista Enlazada 
 * 
 */
package adt;
//import adt.NodoLL;

/**
 *
 * @author angel
 */
public class ListaEnlazada {
    
    private NodoLL head;//puntero que se iguala a null

    public ListaEnlazada() {
        this.head = null;
    }
    
    //Función para agregar al inicio de la lista
    void insert(int x){
       NodoLL temp = new NodoLL();
       temp.setData(x);
       temp.setLink(null);
       if( this.head != null )
           temp.setLink(head);
       this.head = temp;
    }
    
    //Función para agregar en posición x
    void insertAt(int x, int n){
        NodoLL temp1 = new NodoLL();
        temp1.setData(x);
        temp1.setLink(null);
        if( n == 1 ){
            head = temp1;
            return;
        }
        NodoLL temp2 = head;
        for( int i = 0; i < n-2; i++){
            temp2 = temp2.getLink();
        }
        temp1.setLink(temp2.getLink());
        temp2.setLink(temp1);
    }
    
    //Función para borrar
    void borrar(int x){
        NodoLL temp = head;
        if( temp == null) return;
        if( x == 1){
            head = temp.getLink();
            return;
        }
        for(int i = 0; i < x-2; i++){
            temp = temp.getLink();
        }
        NodoLL temp2 = temp.getLink();
        temp.setLink(temp2.getLink());
        
    }
    
    //Función para invertir lista
    void reverse(){
        NodoLL current, prev, next;
        current = head; 
        prev = null;
        while(current != null ){
            next = current.getLink();
            current.setLink(prev);
            prev = current;
            current = next;
        }
        head = prev;
        
    }
    
    //Función para imprimir
    void imprimir(){
        NodoLL temp = this.head;
        while( temp != null ){
            System.out.print(" " + temp.getData());
            temp = temp.getLink();
        }
        System.out.println("\n");
        
    }
    
    
}
