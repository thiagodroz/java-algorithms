package MazeSolver;

import java.io.File;

public class App {
	public static void main(String[] args) {
		String filePath = new File("").getAbsolutePath();
		filePath += "/src/MazeSolver/maze.map";
		FileReader fileReader = new FileReader(filePath, 10, 10);
		fileReader.ParseFile();
		MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(), 
				fileReader.getStartPositionRow(),
				fileReader.getStartPositionCol());
		mazeSolver.findWayOut();
	}
}
