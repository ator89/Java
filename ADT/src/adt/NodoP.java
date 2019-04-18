/*
 * Clase para Pila
 */
package adt;

/**
 *
 * @author angel
 */
public class NodoP {
    
    private int data;
    private NodoP top;

    public NodoP() {
        this.data = 0;
        this.top = null;
    }

    public NodoP(int data, NodoP top) {
        this.data = data;
        this.top = top;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodoP getTop() {
        return top;
    }

    public void setTop(NodoP top) {
        this.top = top;
    }

}
