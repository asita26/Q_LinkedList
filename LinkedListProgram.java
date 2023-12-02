public class LinkedListProgram {
    // Node class to represent each element in the linked list
    static class Node {
        int data;
        Node next;

        // Constructor to initialize a node with data
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class to represent the linked list and perform operations
    static class LinkedList {
        Node head;

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

        // Method to insert a new node after a given node
        public void insertAfter(Node prevNode, int data) {
            if (prevNode == null) {
                System.out.println("Previous node cannot be null.");
                return;
            }

            Node newNode = new Node(data);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
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

    public static void main(String[] args) {
        // Creating a linked list
        LinkedList linkedList = new LinkedList();
        linkedList.insert(56);
        linkedList.insert(30);
        linkedList.insert(70);

        // Displaying the elements of the linked list before insertion
        System.out.print("Linked List before insertion: ");
        linkedList.display();

        // Searching for a node with value 30
        int keyToSearch = 30;
        Node foundNode = linkedList.search(keyToSearch);

        // Inserting 40 after the node with value 30
        if (foundNode != null) {
            linkedList.insertAfter(foundNode, 40);
        } else {
            System.out.println("Node with value " + keyToSearch + " not found.");
        }

        // Displaying the elements of the linked list after insertion
        System.out.print("Linked List after insertion: ");
        linkedList.display();
    }
}
