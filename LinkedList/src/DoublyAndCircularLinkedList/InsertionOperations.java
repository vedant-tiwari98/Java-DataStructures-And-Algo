package DoublyAndCircularLinkedList;

public class InsertionOperations {
    static Node insertNodeAtHead(Node head,int value){
        Node newNode = new Node(value);
        if(head==null){
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        return head;
    }
}
