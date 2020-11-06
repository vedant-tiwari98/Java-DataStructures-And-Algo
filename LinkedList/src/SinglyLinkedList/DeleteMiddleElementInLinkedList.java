package SinglyLinkedList;

public class DeleteMiddleElementInLinkedList {
    static Node deleteMiddleElement(Node head){
        if(head == null){
            return null;
        } else if(head.next == null){
            head.data = -1;
            return head;
        } else {
            Node slowPointer = head, fastPointer = head;
            Node previousNode = null;

            while(fastPointer!=null && fastPointer.next!=null){
                fastPointer = fastPointer.next.next;
                previousNode = slowPointer;
                slowPointer = slowPointer.next;
            }
            previousNode.next = slowPointer.next;
            return head;
        }
    }
}
