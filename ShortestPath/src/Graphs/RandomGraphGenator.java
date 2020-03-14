package Graphs;
        import java.util.*;
public class RandomGraphGenator {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph {
        int vertices;
        LinkedList<Edge> [] adjacencylist;

        Graph(int vertices) {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            //initialize adjacency lists for all the vertices
            for (int i = 0; i <vertices ; i++) {
                adjacencylist[i] = new LinkedList<>();
            }
        }

        public void addEgde(int source, int destination, int weight) {
            Edge edge = new Edge(source, destination, weight);
            adjacencylist[source].addFirst(edge); //for directed graph
        }

        public void printGraph(){
            for (int i = 0; i <vertices ; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j <list.size() ; j++) {

                    System.out.print(+i+"  ");
                    System.out.print(+ list.get(j).destination+"  ");
                    System.out.print(+list.get(j).weight+"  ");
                    System.out.println();
                }

            }
        }
    }
    public static void main(String[] args) {
        Random rand=new java.util.Random();
        int vertices = 4000;
        int edges=3000;
        System.out.println(vertices);
        System.out.println(edges);
        Graph graph = new Graph(vertices);

        for(int i=0;i<edges;i++){
            int source = rand.nextInt(4000);
            //System.out.println(source);
            int destination = rand.nextInt(4000);
            //System.out.println(destination);
            int weight = rand.nextInt(10);
            //System.out.println(weight);
            graph.addEgde(source, destination, weight);

        }
        graph.printGraph();
    }
}
