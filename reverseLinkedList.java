class Solution {
  public Node reverseList(Node head) {
    Node cur = head;
    Node prev = null;
    Node next = null;
    
    if(head == null) {
      return head;
    }
    
    while(cur!=null) {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    head = prev;
    return head
  }
}
