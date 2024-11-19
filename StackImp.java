package DataStructures;

public class StackImp {
    int top;
    int maxSize = 5;
    int [] Stack = new int[maxSize];

    // Constructor
    public StackImp() {
        top = -1; // because in Array we have the index Start 0 to 99
    }

    // Push method to add an element to the stack
    public void push(int Element) {
        if (top == maxSize-1) {
            System.out.println("Stack is full");
        } else {
            Stack[++top] = Element;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    /*
        • this function going to remove the top of my Stack Array
        • but to remove an element we must shack if the Array isEmpty of not
    */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;// Return a sentinel value for an empty stack
        } else {
            int poppedElement = Stack[top]; // Store the top element in a variable
            top--;
            return poppedElement; // Return the stored variable
        }
    }

    // Method to get the top element of the stack without removing it
    public int getTop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return  Stack[top];
        }
    }

    public static void main(String[] args) {
        StackImp s = new StackImp();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Stack elements from top to bottom:");
        for (int i = s.getTop(); i > 0; i--) {
            System.out.println(i);
        }
        System.out.println(" ");

        // Define the size Original of Array
        int Element = s.getTop();
        System.out.println("Size Original for Array: " + Element);

        // Show the last popped element
        // s.pop();
        int poppedElement = s.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Top element after pop: " + s.getTop());
    }

}
