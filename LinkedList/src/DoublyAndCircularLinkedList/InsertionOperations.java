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

    static Node insertNodeAtKthPosition(Node head,int k,int position){
        Node newNode = new Node(k);
        if(position == 1){
            newNode.next=head;
            head.prev=newNode;
            head = newNode;
        } else{
            Node currentNode = head, temp = head;
            int i = 1;
            while(i < position){
                currentNode = temp;
                temp = temp.next;
            }
            newNode.next = curr.next;
            temp.prev = newNode;
            currentNode.next = newNode;
            newNode.prev = currentNode;
        }
        return head;
    }
}
