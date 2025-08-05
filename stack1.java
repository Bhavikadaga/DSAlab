import java.util.*;
public class stack1 {
    public static final int max = 5;
    int top;
    int[] arr = new int[max];
   
    public stack1() {
        top = -1;
    }
   
    public void push(int data){
        if(top == max-1){
            System.out.println("Stack overflow");
            return;
        }else{
        top++;
        arr[top] = data;
        System.out.println("Pushed data:"+ data);
        }
    }
   
    public int pop(){
        if(top < 0){
            System.out.println("Stack underflow");
            return -1;
        }else{
        int value = arr[top];
        top--;
        System.out.println("popped data:"+ value);
        return value;
        }
    }
   
    public int peek(){
        if(top < 0){
            System.out.println("stack is empty");
            return -1;
        }else{
        System.out.println("top element:"+ arr[top]);
        return arr[top];
        }
    }
   
    public static void main(String[] args){
        stack1 myStack = new stack1();
       
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
       
        myStack.peek();
       
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
    }
}