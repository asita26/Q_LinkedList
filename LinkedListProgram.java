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

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to delete the last element (popLast) and update the tail
    public void popLast() {
        if (head == null) {
            System.out.println("Cannot popLast from an empty linked list.");
            return;
        }

        if (head.next == null) {
            // If there is only one element in the list, set head to null
            head = null;
            return;
        }

        // Traverse the list to find the second-to-last node
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        // Set the next of the second-to-last node to null
        current.next = null;
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
        linkedList.insert(56);
        linkedList.insert(30);
        linkedList.insert(70);

        // Displaying the elements of the linked list before popLast
        System.out.print("Linked List before popLast: ");
        linkedList.display();

        // Deleting the last element (popLast)
        linkedList.popLast();

        // Displaying the elements of the linked list after popLast
        System.out.print("Linked List after popLast: ");
        linkedList.display();
    }
}
