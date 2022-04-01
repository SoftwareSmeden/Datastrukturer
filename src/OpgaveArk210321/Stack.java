package OpgaveArk210321;

public class Stack {

    /*
    1.	Implementer metoderne i nedenstående stak-klasse efter stak-princippet, og test
        klassen i et main.
     */

    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    /**
     * Construct a stack with the default capacity 16
     */
    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Construct a stack with the specified maximum capacity
     */
    public Stack(int capacity) {
        elements = new int[capacity];
    }

    /**
     * Push a new integer into the top of the stack
     */
    public void push(int value) {
        this.elements[size++] = value;
    }

    /**
     * Return and remove the top element from the stack
     */
    public int pop() {
        return elements[--size];
    }

    /**
     * Return the top element from the stack
     */
    public int peek() {
        return elements[size-1];
    }

    /**
     * Test whether the stack is empty
     */
    public boolean empty() {
        return size == 0;
    }

    /**
     * Return the number of elements in the stack
     */
    public int getSize() {
        return size;
    }

    public int[] getElements() {
        return elements;
    }
}

