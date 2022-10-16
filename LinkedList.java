class LinkedList {
    Node head;

    class Node {
        private int size;
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = next;
            size++;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(5);
        list.addLast(11);
        list.printlist();
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            System.out.println(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
}
