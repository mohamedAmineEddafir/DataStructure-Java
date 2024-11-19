package DataStructures;

public class Stack_LinkedList_Imp<T> {
    static class Node<T> {
    // Node is now a generic class to make the linked list stack flexible and reusable.
        T item;         // The value stored in the node.
        Node<T> next;   // Reference to the next node in the linked list.

        // Constructor to initialize the node with a value.
        Node(T item) {
            this.item = item;
            this.next = null;
        }
    }

    // Define Pointers
    Node<T> Top, Current;

    public Stack_LinkedList_Imp() {
        Top = null;
    }

    public void push (T newItem){
        Node<T> newNode = new Node<>(newItem); // reserve Node in the memory
        newNode.item = newItem;                // save the new node to the node created
        if(newNode.item == null){
            System.out.println("Stack is Not Created");
        } else {
            newNode.next = Top; // move the pointer to the current Node to related them
            Top = newNode;      // move the pointer the last item
        }
    }

    public T pop(){
        if (Top == null){                           // Check if the stack is empty
            System.out.println("Stack is Empty");
            return null;                            // Return null to indicate an empty stack
        } else {
            Node<T> temp = Top;                     // Temporary pointer to the top node
            T ruleBackItem = temp.item;             // Store the item to return
            Top = Top.next;                         // Move Top to the next node
            temp.next = null;                       // (Optional) Disconnect the old node for clarity
            return ruleBackItem;                    // Return the popped item
        }
    }

    public T peek(){
        Node<T> temp = Top;
        if(temp.item == null){
            System.out.println("Stack is Empty");
        } else {
            return temp.item;
        }
        return null;
    }

    public void showDetails(){
        for(Current = Top; Current != null; Current = Current.next ){
            System.out.println(Current.item); // Print the current node's item
        }
    }

    public static void main(String[] args) {
        // The Int object
        Stack_LinkedList_Imp<Integer> stack = new Stack_LinkedList_Imp<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // The String object
        Stack_LinkedList_Imp<String> stackString =new Stack_LinkedList_Imp<>();
        stackString.push("JavaScript");
        stackString.push("php");
        stackString.push("Java");
        stackString.push("Python");

        System.out.println("Items pushed successfully !!");
        System.out.println(" ");



        // Delete String
        //stackString.pop();

        // Print all elements in the stack (int)
        System.out.println("Integer Stack elements:");
        stack.showDetails();
        System.out.println(" ");

        // Deleted
        System.out.println("Popped Item is :  "+ stack.pop());
        //
        System.out.println("The top of int Stack is: "+ stack.peek());
        System.out.println(" ");
        // Print all elements in the stack (String)
        System.out.println("String Stack elements:");
        stackString.showDetails();
        System.out.println(" ");

        System.out.println("The top of int Stack is: "+ stackString.peek());

        System.out.println(" ");

    }
}
