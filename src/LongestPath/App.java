package LongestPath;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Vertex> vertexList = new ArrayList<Vertex>();
		
		vertexList.add(new Vertex("S"));
		vertexList.add(new Vertex("A"));
		vertexList.add(new Vertex("B"));
		vertexList.add(new Vertex("C"));
		vertexList.add(new Vertex("D"));
		vertexList.add(new Vertex("E"));
		
		List<Edge> edgeList = new ArrayList<Edge>();
		
		edgeList.add(new Edge(vertexList.get(0), vertexList.get(1), -1));
		edgeList.add(new Edge(vertexList.get(0), vertexList.get(3), -2));
		
		edgeList.add(new Edge(vertexList.get(1), vertexList.get(2), -6));
		
		edgeList.add(new Edge(vertexList.get(2), vertexList.get(4), -1));
		edgeList.add(new Edge(vertexList.get(2), vertexList.get(5), -2));
		
		edgeList.add(new Edge(vertexList.get(3), vertexList.get(1), -4));
		edgeList.add(new Edge(vertexList.get(3), vertexList.get(4), -3));
		
		edgeList.add(new Edge(vertexList.get(4), vertexList.get(5), -1));
		
		BellmanFord bellmanFordAlgorithm = new BellmanFord(vertexList, edgeList);
		bellmanFordAlgorithm.bellmanFord(vertexList.get(0));
		bellmanFordAlgorithm.longestPathTo(vertexList.get(5));
	}
}
