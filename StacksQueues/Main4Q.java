public class Main4Q {
    public static void main(String[] args) {

        Queue myQ = new Queue(1);
        myQ.printQ();

        myQ.enQueue(6);
        myQ.printQ();

        myQ.enQueue(9);
        myQ.printQ();
        myQ.deQueue();
        myQ.printQ();
    }
}
