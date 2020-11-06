package SinglyLinkedList;

public class AddOneToNumberRepresentedAsLinkedList {

    // A number(n) is represented in Linked List such that each digit
    // corresponds to a node in linked list. Add 1 to it.

    // Note:-> Linked List representation of a number is from left
    // to right i.e if the number is 123 then in linkedlist it is
    // represented as 3->2->1

    static Node addOne(Node head){
        Node currentNode = head;
        int carry  = 1;
        Node previousNode = null;

        while(currentNode!=null){
            int newValue = currentNode.data + carry;
            currentNode.data = newValue%10;
            carry = newValue/10;
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if(carry > 0){
            previousNode.next = new Node(carry);
        }
        return head;
    }
}
