public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{

        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){

        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public LinkedList() {
    }

    public void printList(){

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void getHead(){
        System.out.println("Head = "+ head.value);
    }

    public void getTail(){
        System.out.println("Tail = "+ tail.value);
    }

    public void getLength(){
        System.out.println("Length = "+ length);
    }

    public void appendList(int value){

        Node newNode = new Node(value);

        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void removeLast(){

        Node temp = head;

        if(head==null){
            System.out.println("NO ELEMENTS");
            length = 0;
            return;
        }else if(head.next == null){
            head = null;
            tail = null;
        }else{

            while(temp.next.next!=null){
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
        }
        length--;
    }
    public void prepend(int value){
        Node newNode = new Node(value);

        if(head==null){
            head = newNode;
            tail = newNode;
        } else{

            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void removeFirst(){
        if(head==null) return;
        if(head.next==null){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
        }
        length--;
    }

    public Node get(int index){
        if(index<0 || index>=length) return null;

        Node temp = head;

        for(int i = 0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void set(int index, int value){
        Node temp = get(index);
        if(temp!=null){
            temp.value = value;
            System.out.println("Value Updated!");
        }else{
            System.out.println("ERR: Index out of bound");
        }
    }

    public void insert(int index, int value){

        if(index<0 || index>length) return;
        if(index==0){
            prepend(value);
            return;
        }
        if(index==length){
            appendList(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);

        newNode.next = temp.next;
        temp.next = newNode;

        length++;
        return;
    }

    public void remove(int index){
        if(index<0 || index>=length) return;
        if(index==0){
            removeFirst();
            return;
        }
        if(index==length-1){
            removeLast();
            return;
        }
        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = head;

        Node after = temp.next;
        Node before = null;

        for(int i =0;i<length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}