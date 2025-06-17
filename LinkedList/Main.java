public class Main {

    public static void main(String[] args){

        LinkedList myLinkedList = new LinkedList(9);

        myLinkedList.appendList(1);
        myLinkedList.appendList(4);
        myLinkedList.appendList(6);
        myLinkedList.appendList(8);
        myLinkedList.appendList(9);
        myLinkedList.appendList(7);
//        myLinkedList.appendList(0);
//        myLinkedList.appendList(0);



        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();
        myLinkedList.removeLast();
        myLinkedList.removeLast();
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();

        LinkedList myNewLinkedList = new LinkedList();
        myNewLinkedList.appendList(1);
        myNewLinkedList.printList();
        myNewLinkedList.removeLast();
        myNewLinkedList.printList();

        LinkedList emptyList = new LinkedList();
//        emptyList.removeLast();
        emptyList.appendList(21);
        emptyList.printList();


        myLinkedList.prepend(5);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();

        myLinkedList.removeFirst();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        myLinkedList.printList();
        emptyList.removeFirst();
//        emptyList.removeFirst();
        emptyList.printList();

        System.out.println(myLinkedList.get(3).value);

        myLinkedList.set(3, 9);
        myLinkedList.printList();
        myLinkedList.set(9,6);

        myLinkedList.printList();
        myLinkedList.insert(0, 1);
        myLinkedList.printList();
        myLinkedList.insert(3, 2);
        myLinkedList.printList();
        myLinkedList.insert(9, 101);
        myLinkedList.printList();

        myLinkedList.remove(0);
        myLinkedList.printList();
        myLinkedList.remove(5);
        myLinkedList.printList();
        myLinkedList.remove(2);
        myLinkedList.printList();

        LinkedList rev = new LinkedList(1);
        rev.appendList(2);
        rev.appendList(3);
        rev.appendList(4);
        rev.printList();
        rev.reverse();
        rev.printList();


    }
}
