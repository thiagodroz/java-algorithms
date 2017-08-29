package KruskalAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
	private int nodeCount = 0;
	private int setCount = 0;
	private List<Node> rootNodes;
	
	public DisjointSet(List<Vertex> vertexes) {
		this.rootNodes = new ArrayList<Node>(vertexes.size());
		makeSets(vertexes);
	}
	
	public int find(Node n) {
		Node currentNode = n;
		
		while(currentNode.getParent() != null) {
			currentNode = currentNode.getParent();
		}
		
		Node rootNode = currentNode;
		
		currentNode = n;
		while(currentNode != rootNode) {
			Node temp = currentNode.getParent();
			currentNode.setParent(rootNode);
			currentNode = temp;
		}
		
		return rootNode.getId();
	}
	
	private void makeSets(List<Vertex> vertexes) {
		for (Vertex v : vertexes) {
			makeSet(v);
		}
	}
	
	private void makeSet(Vertex vertex) {
		Node n = new Node(0, rootNodes.size(), null);
		vertex.setNode(n);
		this.rootNodes.add(n);
		this.setCount++;
		this.nodeCount++;
	}
}
