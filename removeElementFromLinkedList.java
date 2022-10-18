class Solution {
  public Node removeElement(Node head, int val) {
    Node ptr = head;
    Node prev = null;
    
    while (ptr != null) {
      if (ptr.val == val) {
        if (ptr == head) {
          ptr = head.next;
          head.next = prev;
          head = ptr;
          continue;
        } else {
          prev.next = ptr.next;
          ptr.next = null;
          ptr = prev.next;
          continue;
        }
      }
      prev = ptr;
      ptr = ptr.next;
    }
    return head;
  }
}
