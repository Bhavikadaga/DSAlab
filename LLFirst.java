class LLFirst {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("This list is empty");
            return;
        }
        head = head.next;
    }
   
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LLFirst list = new LLFirst();
        list.addFirst("book");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.printList();  
        list.deleteFirst();
        list.printList();
    }
}