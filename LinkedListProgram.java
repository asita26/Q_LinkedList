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

        // Method to delete a node by value
        public void delete(int key) {
            Node current = head;
            Node prev = null;

            // Find the node to be deleted and its previous node
            while (current != null && current.data != key) {
                prev = current;
                current = current.next;
            }

            // If the node with the key is found, delete it
            if (current != null) {
                // If the node to be deleted is the head
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
            }
        }

        // Method to calculate the size of the linked list
        public int size() {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
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
        linkedList.insert(40);
        linkedList.insert(70);

        // Displaying the elements of the linked list before deletion
        System.out.print("Linked List before deletion: ");
        linkedList.display();

        // Searching for a node with value 40
        int keyToDelete = 40;
        Node foundNode = linkedList.search(keyToDelete);

        // Deleting the node with value 40
        if (foundNode != null) {
            linkedList.delete(keyToDelete);
            System.out.println("Node with value " + keyToDelete + " deleted.");
        } else {
            System.out.println("Node with value " + keyToDelete + " not found.");
        }

        // Displaying the elements of the linked list after deletion
        System.out.print("Linked List after deletion: ");
        linkedList.display();

        // Displaying the size of the linked list
        System.out.println("Linked List size: " + linkedList.size());
    }
}
