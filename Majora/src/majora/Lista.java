
package majora;

import majora.Nodo;
import majora.Persona;

/**
 *
 * @author angel
 */
public class Lista {
    
    private Nodo head;

    public Lista() {
        this.head = null;
    }
    
    void addUser(Persona u){
        Nodo temp = new Nodo();
        temp.setData(u);
        temp.setLink(null);
        if( head != null )
            temp.setLink(head);
        head = temp;
        System.out.println("agregado con éxito");
    }
    
    void print(){
        Nodo temp = head;
        while ( temp != null ){
            System.out.println(" "+temp.getData().getUsuario());
            temp = temp.getLink();
        }
        System.out.println("\n");
    }
    
    
}
