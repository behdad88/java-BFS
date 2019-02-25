import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public void BFS(Vertex rootVertex){

        Queue<Vertex> queue = new LinkedList<Vertex>();

        rootVertex.setVisited(true);
        ((LinkedList<Vertex>) queue).add(rootVertex);

        while (!queue.isEmpty()){
            Vertex actualVertex = queue.remove();
            System.out.println(actualVertex);

            for (Vertex v : actualVertex.getNeighboursList()){
                if (!v.isVisited()){
                    v.setVisited(true);
                    ((LinkedList<Vertex>) queue).add(v);
                }
            }
        }

    }
}
