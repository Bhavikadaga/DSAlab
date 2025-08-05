// USER INPUT
import java.util.*;

public class useripstack {
    int top;
    int[] arr;
    int max;

    public useripstack(int size) {
        max = size;
        arr = new int[max];
        top = -1;
    }

    public void push(int data) {
        if (top == max - 1) {
            System.out.println("Stack overflow");
            printStack();
            return;
        }
        arr[++top] = data;
        System.out.println("Pushed data: " + data);
        printStack();
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            printStack();
            return -1;
        }
        int value = arr[top--];
        System.out.println("Popped data: " + value);
        printStack();
        return value;
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            printStack();
            return -1;
        }
        System.out.println("Top element: " + arr[top]);
        printStack();
        return arr[top];
    }

    public void printStack() {
        if (top < 0) {
            System.out.println("Stack is empty: []");
            return;
        }
        System.out.print("Stack elements: [");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]);
            if (i != top) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the stack size: ");
        int size = scanner.nextInt();

        useripstack myStack = new useripstack(size);
        System.out.println("Stack size set to: " + size);

        while (true) {
            System.out.println("\nChoose operation: push, pop, peek, exit");
            String command = scanner.next();

            if (command.equalsIgnoreCase("push")) {
                System.out.print("Enter number to push: ");
                int num = scanner.nextInt();
                myStack.push(num);
            } else if (command.equalsIgnoreCase("pop")) {
                myStack.pop();
            } else if (command.equalsIgnoreCase("peek")) {
                myStack.peek();
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid command! Please try again.");
            }
        }

        scanner.close();
    }
}