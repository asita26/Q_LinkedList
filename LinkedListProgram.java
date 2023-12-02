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

    // Method to delete the first element (pop) and update the head
    public void pop() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("Cannot pop from an empty linked list.");
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
        linkedList.insert(56);
        linkedList.insert(30);
        linkedList.insert(70);

        // Displaying the elements of the linked list before popping
        System.out.print("Linked List before pop: ");
        linkedList.display();

        // Deleting the first element (pop)
        linkedList.pop();

        // Displaying the elements of the linked list after popping
        System.out.print("Linked List after pop: ");
        linkedList.display();
    }
}
