public class Main {

    public static void main(String[] args){

//        HashTable myHT = new HashTable();
//
//        myHT.printList();

        HashTable myHashTable = new HashTable();

        myHashTable.set("paint",1200);
        myHashTable.set("bolts",1200);
        myHashTable.set("nails",1200);
        myHashTable.set("tile",1200);
        myHashTable.set("lumber",1200);
//        myHashTable.set("sneaker",1200);

        System.out.println(myHashTable.keys());

    }
}
