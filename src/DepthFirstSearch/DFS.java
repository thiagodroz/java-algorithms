package DepthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {
	private Stack<Vertex> stack;
	
	public DFS() {
		this.stack = new Stack<Vertex>();
	}
	
	public void dfs (List<Vertex> vertexList) {
		for (Vertex v : vertexList) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsRecursive(v);
			}
		}
	}
	
	private void dfsRecursive (Vertex v) {
		System.out.println(v + " ");
		
		for (Vertex vertex : v.getNeighboursList()) {
			if (!vertex.isVisited()) {
				vertex.setVisited(true);
				dfsRecursive(vertex);
			}
		}
	}
	
	private void dfsWithStack (Vertex rootVertex) {
		this.stack.add(rootVertex);
		rootVertex.setVisited(true);
		
		while (!stack.isEmpty()) {
			Vertex actualVertex = this.stack.pop();
			System.out.println(actualVertex + " ");
			
			for (Vertex v : actualVertex.getNeighboursList()) {
				if (!v.isVisited()) {
					v.setVisited(true);
					this.stack.push(v);
				}
			}
		}
	}
}
