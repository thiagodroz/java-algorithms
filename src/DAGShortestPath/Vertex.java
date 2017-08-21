package DAGShortestPath;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name;
	private boolean visited;
	private double distance = Double.MAX_VALUE;
	private Vertex previousVertex;
	private List<Edge> adjencies;
	
	public Vertex(String name) {
		this.name = name;
		this.adjencies = new ArrayList<Edge>();
	}
	
	public void addNeighbour(Edge edge) {
		this.adjencies.add(edge);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Vertex getPreviousVertex() {
		return previousVertex;
	}

	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}

	public List<Edge> getAdjencies() {
		return adjencies;
	}

	public void setAdjencies(List<Edge> adjencies) {
		this.adjencies = adjencies;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
