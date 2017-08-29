package KruskalAlgorithm;

public class Edge implements Comparable<Edge> {
	private double weight;
	private Vertex startVertex;
	private Vertex targetVertex;

	public Edge(Double weight, Vertex startVertex, Vertex targetVertex) {
		this.weight = weight;
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Vertex getStartVertex() {
		return startVertex;
	}

	public void setStartVertex(Vertex startVertex) {
		this.startVertex = startVertex;
	}

	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public void setTargetVertex(Vertex targetVertex) {
		this.targetVertex = targetVertex;
	}

	@Override
	public int compareTo(Edge edge) {
		return Double.compare(this.weight, edge.getWeight());
	}
}
