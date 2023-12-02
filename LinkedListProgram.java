// Main.java

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node after a specific value
    public void insertAfter(int previousValue, int data) {
        Node newNode = new Node(data);
        Node current = head;

        // Find the node with the previous value
        while (current != null && current.data != previousValue) {
            current = current.next;
        }

        // If the node is found, insert the new node after it
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Previous value " + previousValue + " not found in the linked list.");
        }
    }

    // Method to display the elements of the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedListProgram {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Inserting elements into the linked list
        linkedList.insertAfter(56, 30); // Inserting 30 after 56
        linkedList.insertAfter(30, 70); // Inserting 70 after 30

        // Displaying the elements of the linked list
        System.out.print("Linked List: ");
        linkedList.display();
    }
}
