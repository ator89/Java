package datastructures;

/**
 *
 * @author angel
 */
public class Node {
    private Node next;
    private Node previous;
    private int data;

    public Node() {
        next = null;
        previous = null;
        data = 0;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
