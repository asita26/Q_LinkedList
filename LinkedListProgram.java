public class LinkedListProgram {

    // Node class to represent each element in the linked list
    static class Node<T extends Comparable<T>> {
        T data;
        Node<T> next;

        // Constructor to initialize a node with data
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // SortedLinkedList class to represent the ordered linked list
    static class SortedLinkedList<T extends Comparable<T>> {
        Node<T> head;

        // Constructor to initialize an empty linked list
        public SortedLinkedList() {
            this.head = null;
        }

        // Method to insert a new node in sorted order
        public void add(T data) {
            Node<T> newNode = new Node<>(data);

            // If the list is empty or the new node is smaller than the head
            if (head == null || data.compareTo(head.data) < 0) {
                newNode.next = head;
                head = newNode;
                return;
            }

            // Find the appropriate position to insert the new node
            Node<T> current = head;
            while (current.next != null && data.compareTo(current.next.data) > 0) {
                current = current.next;
            }

            // Insert the new node
            newNode.next = current.next;
            current.next = newNode;
        }

        // Method to display the elements of the linked list
        public void display() {
            Node<T> current = head;
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
        // Creating a sorted linked list
        SortedLinkedList<Integer> sortedLinkedList = new SortedLinkedList<>();
        sortedLinkedList.add(56);
        sortedLinkedList.add(30);
        sortedLinkedList.add(40);
        sortedLinkedList.add(70);

        // Displaying the elements of the sorted linked list
        System.out.print("Sorted Linked List: ");
        sortedLinkedList.display();
    }
}
