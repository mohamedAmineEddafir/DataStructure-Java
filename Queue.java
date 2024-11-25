package DataStructures;

public class Queue {

    private int front;
    private int rear;
    private int length;

    // Define Array with a constant value
    private final int MAX_LENGTH = 10;
    int [] Arr = new int [MAX_LENGTH];

    public Queue() {
        front = 0;
        rear = MAX_LENGTH - 1; // Setting 'rear' this way ensures the first push in the circular array goes to the start (head) of the array
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return length == MAX_LENGTH;
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % MAX_LENGTH;
            Arr[rear] = value;
            length++;
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else {
            int CurrentValue = Arr[front];
            front = (front + 1) % MAX_LENGTH;
            length--;
            int InitialValue = Arr[front];

            System.out.println("the initial value is : " + InitialValue);
            System.out.println("the value Dropped is : " + CurrentValue);
        }
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public int getLength() {
        return length;
    }

    public void clear() {
        front = 0;
        rear = MAX_LENGTH - 1;
        length = 0;
    }

    public void printQueue() {
        for (int j : Arr) {
            System.out.print(j + " ");
        }
    }


    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);

        // print All Queue content
        queue.printQueue();
        System.out.println(" ");
        System.out.println(" ");

        // Removes the first element (FIFO - First In, First Out).
        // queue.dequeue();

        // The information about Queue Array :
        System.out.println("The head of queue is : " + queue.getFront());
        System.out.println("The End of queue is  : " + queue.getRear());
        System.out.println("Determines how many values are empty  : " + queue.getLength());
    }

}
