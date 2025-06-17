public class Main {

    public static void main(String[] args){

        DoublyLinkedList myDLL =  new DoublyLinkedList(1);
        myDLL.printList();
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.append(2);
        myDLL.append(3);
        myDLL.printList();

//        myDLL.removeLast();
//        myDLL.printList();
//        myDLL.removeLast();
//        myDLL.printList();

        myDLL.prepend(9);
        myDLL.printList();

        myDLL.removeFirst();
        myDLL.printList();

        System.out.println(myDLL.get(0).value);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        myDLL.set(1, 5);
        myDLL.printList();

        DoublyLinkedList newDLL = new DoublyLinkedList(1);
        newDLL.append(4);
        newDLL.append(3);
        newDLL.printList();
        newDLL.insert(1,2);
        newDLL.printList();
        newDLL.set(2,3);
        newDLL.set(3,4);
        newDLL.printList();



    }
}
