package KosarajuSCC;

import java.util.Stack;

public class DFSOrder {
	private Stack<Vertex> stack;
	
	public DFSOrder(Graph graph) {
		this.stack = new Stack<>();
		
		for(Vertex vertex : graph.getVertexList()) {
			if(!vertex.isVisited()) {
				dfs(vertex);
			}
		}
	}
	
	private void dfs(Vertex vertex) {
		vertex.setVisited(true);
		
		for(Vertex v : vertex.getAdjacencies()) {
			if(!v.isVisited()) {
				dfs(v);
			}
		}
		
		stack.push(vertex);
	}
	
	public Stack<Vertex> getReversePost() {
		return this.stack;
	}
}
