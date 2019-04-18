/*
 * Nodo para Lista Enlazada
 */
package adt;

/**
 *
 * @author angel
 */
public class NodoLL {
    
    private int data;
    private NodoLL link;

    public NodoLL() {
        this.data = 0;
        this.link = null;
    }

    public NodoLL(int data, NodoLL link) {
        this.data = data;
        this.link = link;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodoLL getLink() {
        return link;
    }

    public void setLink(NodoLL link) {
        this.link = link;
    }
    
}
