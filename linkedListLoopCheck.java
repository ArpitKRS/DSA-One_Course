class Solution {
  public boolean hasCycle(Node head) {
    if(head==null) return false;
    
    Node fast=head;
    Node slow=head;
    
    while(fast.next!=null && fast.next.next!=null) {
      slow=slow.next;
      fast=fast.next.next;
      if(fast=slow) return true;
    }
    return false;
  }

}
