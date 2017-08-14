package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name;
	private boolean visited;
	private List<Vertex> neighboursList;
	
	public Vertex(String name) {
		this.name = name;
		this.neighboursList = new ArrayList<Vertex>();
	}
	
	public void addNeighbour(Vertex vertex) {
		this.neighboursList.add(vertex);
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

	public List<Vertex> getNeighboursList() {
		return neighboursList;
	}

	public void setNeighboursList(List<Vertex> neighboursList) {
		this.neighboursList = neighboursList;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
