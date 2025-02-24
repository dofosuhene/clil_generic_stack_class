

// generic stack class
public class stack<T> {
    private Object[] stackarray; // array to hold stack elements
    private int top; // points to top element
    private int capacity; // max size of stack

    // constructor with default size of 10
    public stack() {
        this.capacity = 10;
        this.stackarray = new Object[capacity];
        this.top = -1;
    }

    // constructor with custom size
    public stack(int capacity) {
        this.capacity = capacity;
        this.stackarray = new Object[capacity];
        this.top = -1;
    }

    // add element to stack
    public void push(T element) throws stackfullexception {
        if (top == capacity - 1) {
            throw new stackfullexception("stack is full");
        }
        stackarray[++top] = element;
    }

    // remove and return top element
    public T pop() throws stackemptyexception {
        if (top == -1) {
            throw new stackemptyexception("stack is empty");
        }
        @SuppressWarnings("unchecked")
        T element = (T) stackarray[top];
        stackarray[top--] = null; // remove element
        return element;
    }

    // look at top element without removing
    public T peek() throws stackemptyexception {
        if (top == -1) {
            throw new stackemptyexception("stack is empty");
        }
        return (T) stackarray[top];
    }

    // return stack as string
    // return stack as string
    public String list() {
        String result = "";
        for (int i = 0; i <= top; i++) {
            result += stackarray[i];
            if (i < top) {
                result += ";";
            }
        }
        return result;
    }

}
// exception for full stack
class stackfullexception extends Exception {
    public stackfullexception(String message) {
        super(message);
    }
}

// exception for empty stack
class stackemptyexception extends Exception {
    public stackemptyexception(String message) {
        super(message);
    }
}