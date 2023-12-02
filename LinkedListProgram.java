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

    // LinkedList class to represent the linked list and perform operations
    static class LinkedList<T extends Comparable<T>> {
        Node<T> head;

        // Constructor to initialize an empty linked list
        public LinkedList() {
            this.head = null;
        }

        // Method to insert a new node at the beginning of the linked list
        public void add(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
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

    // Queue class that internally uses a LinkedList
    static class Queue<T extends Comparable<T>> {
        LinkedList<T> linkedList;

        // Constructor to initialize a queue with an empty linked list
        public Queue() {
            this.linkedList = new LinkedList<>();
        }

        // Method to enqueue an element into the queue
        public void enqueue(T data) {
            linkedList.add(data);
        }

        // Method to dequeue an element from the queue
        public T dequeue() {
            if (linkedList.head == null) {
                throw new IllegalStateException("Queue is empty");
            }
            T data = linkedList.head.data;
            linkedList.head = linkedList.head.next;
            return data;
        }

        // Method to display the elements of the queue
        public void display() {
            linkedList.display();
        }
    }

    // Queue class that internally uses a LinkedList
    static class Queue<T extends Comparable<T>> {
        LinkedList<T> linkedList;

        // Constructor to initialize a queue with an empty linked list
        public Queue() {
            this.linkedList = new LinkedList<>();
        }

        // Method to enqueue an element into the queue
        public void enqueue(T data) {
            linkedList.add(data);
        }

        // Method to dequeue an element from the queue
        public T dequeue() {
            if (linkedList.head == null) {
                throw new IllegalStateException("Queue is empty");
            }
            T data = linkedList.head.data;
            linkedList.head = linkedList.head.next;
            return data;
        }

        // Method to display the elements of the queue
        public void display() {
            linkedList.display();
        }
    }

    public static void main(String[] args) {
        // Creating a queue using a linked list
        Queue<Integer> queue = new Queue<>();

        // Enqueuing elements into the queue
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Displaying the elements of the queue
        System.out.print("Queue: ");
        queue.display();

        // Dequeuing elements from the queue until it is empty
        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.dequeue());
        }

        // Creating a queue using a linked list
        Queue<Integer> queue = new Queue<>();

        // Enqueuing elements into the queue
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Displaying the elements of the queue
        System.out.print("Queue: ");
        queue.display();

        // Dequeuing elements from the queue until it is empty
        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.dequeue());
        }
    }
}
