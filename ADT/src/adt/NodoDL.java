/*
 * Nodo para lista doblemente enlazada
 */
package adt;

/**
 *
 * @author angel
 */
public class NodoDL {
    
    private int data;
    private NodoDL next, prev;

    public NodoDL() {
        this.data = 0;
        this.prev = null;
        this.next = null;
    }

    public NodoDL(int data, NodoDL next, NodoDL prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodoDL getNext() {
        return next;
    }

    public void setNext(NodoDL next) {
        this.next = next;
    }

    public NodoDL getPrev() {
        return prev;
    }

    public void setPrev(NodoDL prev) {
        this.prev = prev;
    }
    
}
