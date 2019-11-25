// Reverse LinkedList 
public static Node reverseLinkedList(Node head) {
    if(head == null || head.next == null) return head;
    
    Node next = head.next;
    Node current = head;
    Node prev =null;
    
    while(current != null ) {  
        Node temp = next;
        next = current.next;
        temp.next = current;
        prev = temp;
    }
  return current;
    
    
}
