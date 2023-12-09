public class Graph {
    // Inner class to represent edges
    class Edge {
        int src, dest;
    }

    int vertices, edges;
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;
        edge = new Edge[edges];

        for (int i = 0; i < edges; i++) {
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {
        // Define the number of vertices and edges
        int noVertices = 7;
        int noEdges = 10;

        // Create an object of Graph
        Graph g = new Graph(noVertices, noEdges);

        // Create the graph by setting source and destination for each edge
        g.edge[0].src = 1; // edge 1---2
        g.edge[0].dest = 2;
        g.edge[1].src = 1; // edge 1---3
        g.edge[1].dest = 3;
        g.edge[2].src = 1; // edge 1---4
        g.edge[2].dest = 4;
        g.edge[3].src = 2; // edge 2---4
        g.edge[3].dest = 4;
        g.edge[4].src = 2; // edge 2---5
        g.edge[4].dest = 5;
        g.edge[5].src = 3; // edge 3---4
        g.edge[5].dest = 4;
        g.edge[6].src = 3; // edge 3---5
        g.edge[6].dest = 5;
        g.edge[7].src = 4; // edge 4---5
        g.edge[7].dest = 5;
        g.edge[8].src = 4; // edge 4---6
        g.edge[8].dest = 6;
        g.edge[9].src = 5; // edge 5---7
        g.edge[9].dest = 7;

        // Print the graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(g.edge[i].src + " - " + g.edge[i].dest);
        }
    }
}
