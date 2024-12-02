package DataStructures;

/**
 * A generic Queue implementation using a linked list.
 * Supports basic operations like enqueue, dequeue, and checking front/rear elements.
 *
 * @param <T> the type of elements stored in the queue
 */
public class QueueUsingLinkedList<T> {

    // Node class representing an element in the linked list.
    static class Node<T> {
        T value;       // The value of the node.
        Node<T> next;  // Reference to the next node.

        // Constructor to initialize a node with a value.
        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    // Queue properties: front, rear, and the count of elements.
    private Node<T> front;
    private Node<T> rear;
    private int count;

    // Constructor to initialize an empty queue.
    public QueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
        this.count = 0; // Corrected initialization.
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty; false otherwise.
     */
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Adds an element to the rear of the queue.
     *
     * @param value the value to be added.
     */
    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            front = rear = newNode; // Both front and rear point to the new node.
        } else {
            rear.next = newNode; // Link new node at the rear.
            rear = newNode;      // Update rear to the new node.
        }
        count++; // Increment the element count.
    }

    /**
     * Removes an element from the front of the queue.
     * Prints the value being removed.
     */
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            T frontDropped = front.value; // Capture the value to be removed.
            front = front.next;           // Move the front pointer.
            if (front == null) {          // If the queue becomes empty.
                rear = null;
            }
            count--; // Decrement the element count.
            System.out.println("Value dropped: " + frontDropped);
        }
    }

    /**
     * Retrieves the value at the front of the queue without removing it.
     *
     * @return the front value, or null if the queue is empty.
     */
    public T getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        return front.value;
    }

    /**
     * Retrieves the value at the rear of the queue without removing it.
     *
     * @return the rear value, or null if the queue is empty.
     */
    public T getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        return rear.value;
    }

    /**
     * Gets the number of elements in the queue.
     *
     * @return the size of the queue.
     */
    public int getCount() {
        return count;
    }

    /**
     * Prints all elements in the queue from front to rear.
     */
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements:");
            Node<T> current = front;
            while (current != null) {
                System.out.println(current.value); // Print each value.
                current = current.next;
            }
        }
    }

    /**
     * Clears all elements from the queue.
     */
    public void clear() {
        if (isEmpty()) {
            System.out.println("Queue is already empty.");
        } else {
            front = null;
            rear = null;
            count = 0; // Reset the count.
            System.out.println("Queue has been cleared.");
        }
    }

    public static void main(String[] args) {
        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("Original Queue : ");
        queue.printQueue();

        System.out.println("\nDropped Sid : ");
        queue.dequeue();
        queue.dequeue();

        System.out.println("\nQueue after dequeue process : ");
        queue.printQueue();

        System.out.println("\nThe front of Queue is             : " + queue.getFront());
        System.out.println("the element Number in my queue is : "+ queue.getCount());
    }

}
