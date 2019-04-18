/*

 */
package adt;
/**
 *
 * @author angel
 */
//import ListaEnlazada;

public class ADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        ListaDoble l2 = new ListaDoble();
        Pila p = new Pila();
        Cola q = new Cola();
        Sortear s = new Sortear();
        int arr[] = {5,8,3,7,2,6,1};
        s.bubble(arr, arr.length);
        for (int i = 0; i < arr.length -1 ; i++) {
            System.out.print(" " + arr[i]);
        }
        
        System.out.println("\n");
        q.enqueue(30);
        q.enqueue(5);
        q.enqueue(7);
        q.enqueue(3);
        
        System.out.println(q.front());
        q.dequeue();
        System.out.println(q.front());
        
        System.out.println("\n\n");
        System.out.println(p.top());
        p.push(4);
        p.push(5);
        p.push(55);
        //p.pop();
        System.out.println(p.top());
        
        l2.insert(45);
        l2.insert(23);
        l2.show();
        
        lista.insert(5); // 5
        lista.insert(7); // 
        lista.insert(3); //
        lista.imprimir(); // 5 7 3
        //System.out.println("\n");
        lista.insertAt(444, 4);
        lista.imprimir();
        //System.out.println("\n");
        lista.borrar(4);
        lista.reverse();
        lista.imprimir();
    }
    
}
