package SinglyLinkedList;

public class DeleteNodeWithoutHeadPointer {

    //Given a Node D of a linked list containing N unique nodes i.e
    // the value at each node is unique, your task is to delete the
    // given node from the list.
    //
    //Note:- It is guaranteed that the given node is not the
    // last node of the list and D is always present in the
    // linked list

    static void deleteNode(Node D){
        Node temp = D.next;
        D.data = temp.data;
        D.next = temp.next;
    }
}
