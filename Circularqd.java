public class Circularqd {
private static final int MAX_SIZE = 5;
private int[] a = new int[MAX_SIZE];
private int front = -1;
private int rear = -1;
public void enqueue(int x) {
if ((rear + 1) % MAX_SIZE == front) {
System.out.println("Queue is full");
return;
}
if (front == -1 && rear == -1) {
front = rear = 0;
} else {
rear = (rear + 1) % MAX_SIZE;
}
a[rear] = x;
printQueue();
}
public int dequeue() {
if (front == -1 && rear == -1) {
System.out.println("Queue is empty");
return -1;
}
int data = a[front];
if (front == rear) {
front = rear = -1;
} else {
front = (front + 1) % MAX_SIZE;
}
return data;
}
public void printQueue() {
if (front == -1) {
System.out.println("Queue is empty");
return;
}
System.out.print("Queue: ");
int i = front;
while (true) {
System.out.print(a[i] + " ");
if (i == rear) break;
i = (i + 1) % MAX_SIZE;
}
System.out.println();
}
public static void main(String[] args) {
CircularQueue queue = new CircularQueue();
queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);
System.out.println("Dequeued: " + queue.dequeue());
System.out.println("Dequeued: " + queue.dequeue());
queue.enqueue(40);
queue.enqueue(50);
queue.enqueue(60);
queue.enqueue(70);
}
}

