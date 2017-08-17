package CycleDetectionDFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name;
	private boolean visited;
	private boolean beingVisited;
	private List<Vertex> adjenciesList;
	
	public Vertex(String name) {
		this.name = name;
		this.adjenciesList = new ArrayList<Vertex>();
	}
	
	public void addNeighbour (Vertex vertex) {
		this.adjenciesList.add(vertex);
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

	public boolean isBeingVisited() {
		return beingVisited;
	}

	public void setBeingVisited(boolean beingVisited) {
		this.beingVisited = beingVisited;
	}

	public List<Vertex> getAdjenciesList() {
		return adjenciesList;
	}

	public void setAdjenciesList(List<Vertex> adjenciesList) {
		this.adjenciesList = adjenciesList;
	}

	@Override
	public String toString() {
		return name;
	}
}
