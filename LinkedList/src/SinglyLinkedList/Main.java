package SinglyLinkedList;

public class Main {
    static Node addElementAtHead(Node head,int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    static Node addElementAtTail(Node head,int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        } else {
            Node currentNode = head;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        return head;
    }
    static Node addElementAtPosition(Node head,int value,int position){
        Node newNode = new Node(value);
        if(position == 1){
            newNode.next = head;
            head = newNode;
        } else {
            Node currentNode = head;
            while(position--!=0){
                if(position == 1){
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
        return head;
    }
    static void printLinkedList(Node head){
        Node currentNode = head;
        if(head == null){
            return;
        }
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
    }
    static Node reverseLinkedList(Node head){
        if(head == null ){
            return null;
        } else {
            Node currentNode = head;
            Node nextNode =null , previousNode = null;

            while(currentNode!=null){
                nextNode = currentNode.next;
                currentNode.next = previousNode;
                previousNode = currentNode;
                currentNode = nextNode;
            }
            return previousNode;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        addElementAtHead(node1,2);
    }
}
