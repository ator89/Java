
package majora;

import majora.Persona;

/**
 *
 * @author angel
 */
public class Nodo {
    
    private Persona data;
    private Nodo link;

    public Nodo() {
    }

    public Nodo(Persona data, Nodo link) {
        this.data = data;
        this.link = link;
    }

    public Persona getData() {
        return data;
    }

    public void setData(Persona data) {
        this.data = data;
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }
    
}
