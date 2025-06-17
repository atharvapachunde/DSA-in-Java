public class Main {
    public static void main(String[] args) {

        Stack myStack = new Stack(1);

        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();

        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.printStack();
        myStack.getTop();
        myStack.getHeight();

        myStack.pop();
        myStack.printStack();
        myStack.getTop();
        myStack.getHeight();
    }
}
