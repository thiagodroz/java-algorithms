package LongestPath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BellmanFord {
	private List<Edge> edgeList;
	private List<Vertex> vertexList;
	
	public BellmanFord(List<Vertex> vertexList, List<Edge> edgeList) {
		this.edgeList = edgeList;
		this.vertexList = vertexList;
	}
	
	public void bellmanFord(Vertex sourceVertex) {
		sourceVertex.setDistance(0);
		
		for (int i = 0; i < vertexList.size() - 1; i++) {
			for (Edge edge : edgeList) {
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetVertex();
				
				if (u.getDistance() == Double.MAX_VALUE) continue;
				
				double newDistance = u.getDistance() + edge.getWeight();
				
				if (newDistance < v.getDistance()) {
					v.setDistance(newDistance);
					v.setPreviousVertex(u);
				}
			}
		}
		
		for (Edge edge : edgeList) {
			if (edge.getStartVertex().getDistance() != Double.MAX_VALUE) {
				if (hasCycle(edge)) {
					System.out.println("Negative edge weight cycle detected...");
					
					return;
				}
			}
		}
	}

	private boolean hasCycle(Edge edge) {
		return edge.getStartVertex().getDistance() + edge.getWeight() < edge.getTargetVertex().getDistance();
	}
	
	public void longestPathTo(Vertex targetVertex) {
		if (targetVertex.getDistance() == Double.MAX_VALUE) {
			System.out.println("There is no path from the source to the target");
		}
		
		Vertex actualVertex = targetVertex;
		List<Vertex> shortestPath = new ArrayList<Vertex>();
		
		while (actualVertex.getPreviousVertex() != null) {
			shortestPath.add(actualVertex);
			actualVertex = actualVertex.getPreviousVertex();
		}
		
		shortestPath.add(actualVertex);
		Collections.reverse(shortestPath);
		
		 for (Vertex vertex : shortestPath) {
			 System.out.print(vertex + " -> ");
		 }
	}
}