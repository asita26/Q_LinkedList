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

    // Method to search for a node with a specific value
    public Node search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return current;
            }
            current = current.next;
        }
        return null; // Return null if the key is not found
    }

    // Method to display the elements of the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedListProgram {
    public static void main(String[] args) {
        // Creating a linked list
        LinkedList linkedList = new LinkedList();
        linkedList.insert(56);
        linkedList.insert(30);
        linkedList.insert(70);

        // Displaying the elements of the linked list
        System.out.print("Linked List: ");
        linkedList.display();

        // Searching for a node with value 30
        int keyToSearch = 30;
        Node foundNode = linkedList.search(keyToSearch);

        // Displaying the result of the search
        if (foundNode != null) {
            System.out.println("Node with value " + keyToSearch + " found.");
        } else {
            System.out.println("Node with value " + keyToSearch + " not found.");
        }
    }
}
