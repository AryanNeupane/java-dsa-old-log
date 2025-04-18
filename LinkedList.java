public class LinkedList {
    private int[] list;
    private int size;

    LinkedList(int capacity) {
        list = new int[capacity];
        size = 0;
    }

    void addFirst(int value) {
        if (size == list.length) {
            System.out.println("List Overflow");
            return;
        }
        System.arraycopy(list, 0, list, 1, size);
        list[0] = value;
        size++;
    }

    void addLast(int value) {
        if (size == list.length) {
            System.out.println("List Overflow");
            return;
        }
        list[size++] = value;
    }

    void addAt(int index, int value) {
        if (size == list.length) {
            System.out.println("List Overflow");
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid Index");
            return;
        }
        System.arraycopy(list, index, list, index + 1, size - index);
        list[index] = value;
        size++;
    }

    void deleteFirst() {
        if (size == 0) {
            System.out.println("List Underflow");
            return;
        }
        System.arraycopy(list, 1, list, 0, size - 1);
        size--;
    }

    void deleteLast() {
        if (size == 0) {
            System.out.println("List Underflow");
            return;
        }
        size--;
    }

    void deleteAt(int index) {
        if (size == 0) {
            System.out.println("List Underflow");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return;
        }
        System.arraycopy(list, index + 1, list, index, size - index - 1);
        size--;
    }

    void display() {
        if (size == 0) {
            System.out.println("List is Empty");
            return;
        }
        System.out.println("List Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(5);
        list.addFirst(10);
        list.addLast(20);
        list.addAt(1, 15);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteAt(1);
        list.display();
        list.deleteLast();
        list.display();
    }
}
