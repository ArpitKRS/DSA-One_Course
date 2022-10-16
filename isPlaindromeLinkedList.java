class Solution {
  public boolean isPalindrome(Node head) {
    if(head==null) {
      return true;
    }
    
    Node mid = middle(head);
    Node last = reverse(head);
    Node cur = head;
    
    while(last!=null) {
      if(last.data!=cur.data) {
        return false;
      }
      cur = cur.next;
      last = last.next;
    }
    
    return true;
  }
  
  
  public Node middle(Node head) {
    Node fast = head;
    Node slow = head;
    
    while(fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    
    return slow;
  }
  
  public Node reverse(Node head) {
    Node cur = head;
    Node prev = null;
    Node next = null;
    
    while(cur!=null) {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    head = prev;
    return head;
  }
}
