public class Stack {

    private Node top;
    private int height;

    class Node{

        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack(){
        System.out.println("-----");
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("-----");
    }

    public void getTop(){
        System.out.println("Top = "+ top.value);
    }

    public void getHeight(){
        System.out.println("Height = "+ height);
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(height==0) {
            top = newNode;
        } else{
          newNode.next = top;
          top = newNode;
        }
        height++;
    }

    public Node pop(){
        if(height==0)return null;

        Node temp = top;
        top = temp.next;
        temp.next = null;

        height--;
        return temp;
    }
}
