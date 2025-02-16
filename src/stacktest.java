public class stacktest {
    public static void main(String[] args) {
        // test stack with integers
        System.out.println("testing stack with integers:");

        stack<Integer> numberstack = new stack<>(5); // stack with size 5

        try {
            // adding elements to the number stack
            numberstack.push(10);
            numberstack.push(20);
            numberstack.push(30);
            numberstack.push(40);
            numberstack.push(50);
            System.out.println("stack after pushing elements: " + numberstack.list());

            // popping an element
            System.out.println("popped element: " + numberstack.pop());
            System.out.println("stack after popping: " + numberstack.list());

            // peek top element
            System.out.println("top element: " + numberstack.peek());

        } catch (stackfullexception | stackemptyexception e) {
            System.out.println(e.getMessage());
        }

        // test stack with strings
        System.out.println("\ntesting stack with strings:");

        stack<String> textstack = new stack<>(3); // stack with size 3

        try {
            // adding elements to the text stack
            textstack.push("hello");
            textstack.push("world");
            textstack.push("java");
            System.out.println("stack after pushing elements: " + textstack.list());

            // popping an element
            System.out.println("popped element: " + textstack.pop());
            System.out.println("stack after popping: " + textstack.list());

            // peek top element
            System.out.println("top element: " + textstack.peek());

        } catch (stackfullexception | stackemptyexception e) {
            System.out.println(e.getMessage());
        }
    }
}