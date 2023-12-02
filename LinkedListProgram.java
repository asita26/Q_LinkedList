// Node class to represent each element in the linked list
class Node {
    int data;
    Node next;

    // Constructor to initialize a node with data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to represent the linked list and perform operations
class LinkedList {
    Node head; // Head of the linked list

    // Constructor to initialize an empty linked list
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

    // Method to display the elements of the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
// Main class to test the linked list
public class LinkedListProgram {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Inserting elements into the linked list
        linkedList.insert(56);
        linkedList.insert(30);
        linkedList.insert(70);

        // Displaying the elements of the linked list
        System.out.print("Linked List: ");
        linkedList.display();
    }
}
