/* Finding Shortest Path  using Dijkstra,BellmanFord and FloydWarshall Algorithm.
The implementation is extended from CLRS,Princeton.edu,geeksforgeeks */

package Main;
import Algorithms.*;
import Graphs.*;
import Standard.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
         String fileName = "InputFiles//inputfile.txt";
         ArrayList<Integer> integersinlist=new ArrayList<Integer>();
        try {
            In in = new In(fileName);
            while (!in.isEmpty()) {
                Integer s = in.readInt();
                integersinlist.add(s);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        In in=new In(fileName);
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(in);
        int v = integersinlist.get(0);
        System.out.print(+v+",");
        int s = integersinlist.get(1);
        System.out.print(+s+",");

        double start_dij= System.currentTimeMillis();
        DijkstraSP sp = new DijkstraSP(G, s);
        double end_dij = System.currentTimeMillis();
        double finaldij=(end_dij- start_dij);
        System.out.print(+finaldij+",");

        double start_bell = System.currentTimeMillis();
        BellmanFordSP sp1=new BellmanFordSP(G,s);
        double end_bell = System.currentTimeMillis();
        double final_bell=(end_bell - start_bell);
        System.out.print(+final_bell+",");

        double start_dijapsp = System.currentTimeMillis();
        DijkstraAllPairsSP apsp=new DijkstraAllPairsSP(G);
        double end_dijapsp = System.currentTimeMillis();
        double finaldijapsp=(end_dijapsp - start_dijapsp);
        System.out.print(+finaldijapsp+",");

        int V = integersinlist.get(0);
        int E = integersinlist.get(1);
        AdjMatrixEdgeWeightedDigraph AG = new AdjMatrixEdgeWeightedDigraph(V,E);
        double start_floyd = System.currentTimeMillis();
        FloydWarshall apsp1=new Algorithms.FloydWarshall(AG);
        double end_floyd = System.currentTimeMillis();
        double finalfloyd=(end_floyd - start_floyd);
        System.out.print(+finalfloyd);
    }
}