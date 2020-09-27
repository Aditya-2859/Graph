
import java.util.*;

class Graph {
	int v;
	ArrayList<Integer>[] adj; 

	
	Graph(int v){
		this.v = v;
		adj = new ArrayList[v];
		for(int i = 0; i < this.v; i++){
			adj[i] = new ArrayList<Integer>();
		}
	}
	public void addEdge(int u, int v){
		adj[u].add(v);
	}
}

public class BFSTraversalinGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph1 = new Graph(8);
		graph1.addEdge(0, 1);
		graph1.addEdge(1, 2);
		graph1.addEdge(1, 7);
		graph1.addEdge(2, 3);
		graph1.addEdge(2, 4);
		graph1.addEdge(4, 5);
		graph1.addEdge(4, 6);
		graph1.addEdge(4, 7);
		
		Integer IsVisited[] = new Integer[graph1.v];
		for(int i = 0; i < graph1.v; i++){
			IsVisited[i] = 0;
		}
		
		for(int i =0; i < graph1.v; i++)
		{
			if(IsVisited[i] == 0){
				BFS(graph1, i, IsVisited);
			}
				
		}
	}
	static void BFS(Graph graph, int u, Integer[] visited){
		Queue<Integer> q = new LinkedList<>();
		q.add(u);
		while(!q.isEmpty()){
			int traversed = q.remove();
			System.out.println("Traversed node is" + traversed);
			visited[u] = 1;
			for(Integer unvisited : graph.adj[traversed]){
				if(visited[unvisited] == 0){
					visited[unvisited] = 1;
					q.add(unvisited);
				}
			}
		}
	}

}
