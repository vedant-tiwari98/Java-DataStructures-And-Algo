package SinglyLinkedList;

public class DeleteKthNodeFromEnd {

    static Node deleteElement(Node head,int k){
        if(head == null){
            return null;
        } else {
            Node currentNode = head;
            int numberOfNodes = 0;
            while(currentNode!=null){
                currentNode = currentNode.next;
                numberOfNodes ++;
            }
            currentNode = head;
            int position = numberOfNodes - k + 1;
            if(position == 1){
                head = head.next;
            } else {
                while(position--!=0 && currentNode!=null){
                    if(position == 1){
                        currentNode.next = currentNode.next.next;
                    }
                    currentNode = currentNode.next;
                }
            }
            return head;
        }
    }
}
