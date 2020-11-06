package SinglyLinkedList;

public class AddTwoNumbers {
    //Two numbers are represented in Linked List such that
    // each digit corresponds to a node in linked list.
    // Your task is to add these two numbers and return
    // the sum in a linked list.

    //Note:-Linked list representaion of a number is from
    // left to right i.e if the number is 123 than in
    // linked list it is represented as 3->2->1

    static Node addNumber(Node first,Node second){
        // return the head of the modified linked list
        Node previousNode = null, result = null,
        temp = null;
        int carry =0, sum =0;
        while(first!=null || second!=null){
            sum = carry + (first!=null ? first.data: 0) + (second!=null ? second.data : 0);
            carry = (sum>=10) ? 1: 0;
            temp = new Node(sum%10);
            if(result == null) {
                result = temp;
            } else {
                previousNode.next = temp;
            }
            previousNode = temp;
            if(first!=null){
                first = first.next;
            }
            if(second!=null){
                second=second.next;
            }
        }
        if(carry > 0){
            temp.next = new Node(carry);
        }
        return result;
    }
}
