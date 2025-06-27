public class Main {
    public static void main(String[] args) {

        Graph mygraph = new Graph();

        mygraph.addVertex("A");
        mygraph.addVertex("B");
        mygraph.addVertex("C");
        mygraph.addVertex("D");

        mygraph.addEdge("A","B");
        mygraph.addEdge("A","C");
        mygraph.addEdge("A","D");
        mygraph.addEdge("B","D");
        mygraph.addEdge("C","D");

        mygraph.printGraph();

        mygraph.removeVertex("D");
        mygraph.printGraph();

    }
}
