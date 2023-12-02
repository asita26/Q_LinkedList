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

    // Stack class that internally uses a LinkedList
    static class Stack<T extends Comparable<T>> {
        LinkedList<T> linkedList;

        // Constructor to initialize a stack with an empty linked list
        public Stack() {
            this.linkedList = new LinkedList<>();
        }

        // Method to push an element onto the stack
        public void push(T data) {
            linkedList.add(data);
        }

        // Method to pop an element from the stack
        public T pop() {
            if (linkedList.head == null) {
                throw new IllegalStateException("Stack is empty");
            }
            T data = linkedList.head.data;
            linkedList.head = linkedList.head.next;
            return data;
        }


        // Method to peek at the top element of the stack without removing it
        public T peek() {
            if (linkedList.head == null) {
                throw new IllegalStateException("Stack is empty");
            }
            return linkedList.head.data;
        }


        // Method to check if the stack is empty
        public boolean isEmpty() {
            return linkedList.head == null;
        }

        // Method to display the elements of the stack
        public void display() {
            linkedList.display();
        }
    }

    public static void main(String[] args) {
        // Creating a stack using a linked list
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Displaying the elements of the stack
        System.out.print("Stack: ");
        stack.display();


        // Peeking and popping elements from the stack until it is empty
        while (!stack.isEmpty()) {
            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
        }

        // Popping an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        // Displaying the elements of the stack after popping
        System.out.print("Stack after popping: ");
        stack.display();

    }
}
