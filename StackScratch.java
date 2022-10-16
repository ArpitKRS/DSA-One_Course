public class StackScratch {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {

        }
    }

    public static void main(String[] args) {

    }
}
