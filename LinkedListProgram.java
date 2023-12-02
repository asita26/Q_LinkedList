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
    public void insertAtEnd(int data) {
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

        // Appending nodes to create the specified linked list sequence
        linkedList.insertAtEnd(56);  // Adding 56
        linkedList.insertAtEnd(30);  // Appending 30
        linkedList.insertAtEnd(70);  // Appending 70

        // Displaying the elements of the linked list
        System.out.print("LinkedList Sequence: ");
        linkedList.display();
    }
}
