/*
 * Nodo para la Cola
 */
package adt;

/**
 *
 * @author angel
 */
public class NodoQ {
    
    private int data;
    private NodoQ link;

    public NodoQ() {
        this.data = 0;
        this.link = null;
    }

    public NodoQ(int data, NodoQ link) {
        this.data = data;
        this.link = link;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodoQ getLink() {
        return link;
    }

    public void setLink(NodoQ link) {
        this.link = link;
    }
    
}
