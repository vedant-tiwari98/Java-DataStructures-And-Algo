package SinglyLinkedList;

public class SwapKthNodesFromEnds {

    static Node swapKthNode(Node head, int numberOfNodes, int kthposition){
        if(numberOfNodes < kthposition){
            return head;
        }
        if(2*kthposition-1 == numberOfNodes){
            return head;
        }
        Node start = head;
        Node start_prev = null;

        for(int i=1;i<kthposition;i++){
            start_prev = start;
            start = start.next;
        }

        Node end = head;
        Node end_prev = null;
        for(int i=1;i<numberOfNodes-kthposition+1;i++){
            end_prev = end;
            end = end.next;
        }
        if(start_prev!=null){
            start_prev.next = end;
        }
        if(end_prev!=null){
            end_prev.next = start;
        }
        Node temp = start.next;
        start.next = end.next;
        end.next = temp;

        if(kthposition == 1){
            head = end;
        }
        if(kthposition == numberOfNodes){
            head = start;
        }
        return head;
    }
}
