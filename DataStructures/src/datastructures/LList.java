
package datastructures;

/**
 *
 * @author angel
 */
public class LList {
    private Node head;
    private int size;

    public LList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    //Insert at the beginning
    public void insert(int data){
        Node temp = new Node();
        temp.setData(data);
        temp.setNext(null);
        temp.setPrevious(null);
        if(head == null){
            head = temp;
        }else{
            temp.setNext(head);
            head.setPrevious(temp);
            head = temp;
        }
        size++;
    }
    
    public void insertAt(int data, int pos){
        Node temp = new Node();
        temp.setData(data);
        temp.setNext(null);
        temp.setPrevious(null);
        if(head == null){
            head = temp;
        }
        else if(pos == 1){
            temp.setNext(head);
            head.setPrevious(temp);
            head = temp;
        }else if(pos == size+1){
            Node temp2 = head;
            while(temp2.getNext() != null){
                temp2 = temp2.getNext();
            }
            temp2.setNext(temp);
            temp.setPrevious(temp2);
            
        }else{
            Node temp2 = head;
            for(int i = 0; i<pos-2;i++){
                temp = head.getNext();
            }
        }
        size++;
    }
    
    public void show(){
        Node temp = head;
        while(temp != null){
            System.out.print(" "+ temp.getData());
            temp = temp.getNext();
        }
        System.out.println("\n");
    }
    
}
