package Exercise1;

public class SinglyLinkedList {

    private Node head;

    // Constructor
    public SinglyLinkedList() {
        head = null;
    }

    // Add node at the end
    public void add(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Display the linked list
    public void display() {

        Node current = head;

        while (current != null) {

            System.out.print(current.data + " --> ");

            current = current.next;
        }

        System.out.println("NULL");
    }

    // Find the middle node
    public Node findMiddle() {

        if (head == null) {
            return null;
        }

        // Step 1: Count nodes
        int count = 0;

        Node current = head;

        while (current != null) {

            count++;

            current = current.next;
        }

        // Step 2: Calculate middle index
        int middleIndex = count / 2;

        // Step 3: Traverse to middle
        current = head;

        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }

        return current;
    }

    // Get head
    public Node getHead() {
        return head;
    }
    public void deleteMiddle() {

    // Case 1: Empty linked list
    if (head == null) {
        return;
    }

    // Case 2: Only one node
    if (head.next == null) {
        head = null;
        return;
    }

    // Step 1: Count nodes
    int count = 0;

    Node current = head;

    while (current != null) {

        count++;

        current = current.next;
    }

    // Step 2: Find middle index
    int middleIndex = count / 2;

    // Step 3: Find previous node
    Node previous = head;

    for (int i = 0; i < middleIndex - 1; i++) {

        previous = previous.next;
    }

    // Step 4: Delete middle node
    previous.next = previous.next.next;
}
}