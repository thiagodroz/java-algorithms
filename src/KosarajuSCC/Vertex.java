package KosarajuSCC;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private int id;
	private String name;
	private boolean visited;
	private List<Vertex> adjacencies;
	private int componentId;
	
	public Vertex(int id, String name) {
		this.id = id;
		this.name = name;
		this.adjacencies = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Vertex> getAdjacencies() {
		return adjacencies;
	}

	public void setAdjacencies(List<Vertex> adjacencies) {
		this.adjacencies = adjacencies;
	}

	public int getComponentId() {
		return componentId;
	}

	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}
	
	public void addNeighbour(Vertex vertex) {
		this.adjacencies.add(vertex);
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
