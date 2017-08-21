package DAGShortestPath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class AcyclicShortestPath {
	public void shortestPath(List<Vertex> vertexList, Vertex sourceVertex, Vertex targetVertex) {
		sourceVertex.setDistance(0);
		TopologicalSort topologicalSort = new TopologicalSort();
		topologicalSort.makeTopologicalOrder(vertexList);
		
		Stack<Vertex> stack = topologicalSort.getTopologicalOrder();
		
		for (Vertex actualVertex : vertexList) {
			for (Edge edge : actualVertex.getAdjencies()) {
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetVertex();
				
				double newDistance = u.getDistance() + edge.getWeight();
				
				if (newDistance < v.getDistance()) {
					v.setDistance(newDistance);
					v.setPreviousVertex(u);
				}
			}
		}
		
		if (targetVertex.getDistance() == Double.MAX_VALUE) {
			System.out.println("No shortest path here");
		} else {
			System.out.println("Target vertex shortest path: " + targetVertex.getDistance());
		}
	}
	
	public void showShortestPathTo(Vertex targetVertex) {
		List<Vertex> list = new ArrayList<Vertex>();
		
		Vertex actualVertex = targetVertex;
		list.add(actualVertex);
		
		while (actualVertex.getPreviousVertex() != null) {
			actualVertex = actualVertex.getPreviousVertex();
			list.add(actualVertex);
		}
		
		Collections.reverse(list);
		System.out.println(list);
	}
}
