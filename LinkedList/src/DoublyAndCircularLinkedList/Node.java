package DoublyAndCircularLinkedList;

public class Node {
    protected int data;
    protected Node next;
    protected Node prev;

    Node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}
