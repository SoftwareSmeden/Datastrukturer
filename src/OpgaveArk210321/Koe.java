package OpgaveArk210321;

import java.util.Arrays;

public class Koe {

    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    /** Construct a queue with the default capacity 16 */
    public Koe() {
        this(DEFAULT_CAPACITY);
    }

    /** Construct a queue with the specified maximum capacity */
    public Koe(int capacity) {
        elements = new int[capacity];
    }

    /** Insert a new integer into the queue */
    public void offer(int value) {
        elements[size++] = value;
    }

    /** Return and remove the element from the queue */
    public int remove() {
        int temp = elements[0];
        for (int i = 0; i < size-1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = 0;
        size--;
        return temp;
    }

    /** Return the element from the queue, which has been in the queue longest time */
    public int peek() {
        return elements[0];
    }

    /** Test whether the queue is empty */
    public boolean empty() {
        return size == 0;
    }

    /** Return the number of elements in the queue */
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "OpgaveArk1.Koe{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
