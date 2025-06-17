public class Queue {

    private int length;
    private Node first;
    private Node last;

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQ(){
        Node temp = first;
        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();


    }


    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }
    public void enQueue(int value){
        Node newNode = new Node(value);
        if(length==0){
            first = newNode;
            last = newNode;
        } else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
}
