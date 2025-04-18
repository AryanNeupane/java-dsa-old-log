public class Queue {
    private int[] queue;
    private int front, rear, capacity;

    Queue(int size) {
        queue = new int[size];
        front = 0;
        rear = -1;
        capacity = size;
    }

    void enqueue(int value) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = value;
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front++];
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Queue Elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
    }
}
