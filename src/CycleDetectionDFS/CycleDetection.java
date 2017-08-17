package CycleDetectionDFS;

import java.util.List;

public class CycleDetection {
	public void detectCycle(List<Vertex> vertexList) {
		for (Vertex v : vertexList) {
			if (!v.isVisited()) {
				dfs(v);
			}
		}
	}

	private void dfs(Vertex vertex) {
		vertex.setBeingVisited(true);
		
		for (Vertex v : vertex.getAdjenciesList()) {
			if (v.isBeingVisited()) {
				System.out.println("There is a backward edge: so there's a cycle");
				return;
			}
			
			if (!v.isVisited()) {
				v.setVisited(true);
				dfs(v);
			}
		}
		
		vertex.setBeingVisited(false);
		vertex.setVisited(true);
		
	}
}
