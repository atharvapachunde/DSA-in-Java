public class Main {

    public static void main(String[] args){

//        HashTable myHT = new HashTable();
//
//        myHT.printList();

        HashTable myHashTable = new HashTable();

        myHashTable.set("nails",100);
        myHashTable.set("tile",50);
        myHashTable.set("lumber",80);

        System.out.println(myHashTable.get("nails"));
        System.out.println(myHashTable.get("bolts"));

    }
}
