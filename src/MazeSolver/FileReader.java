package MazeSolver;

import java.io.File;
import java.util.Scanner;

public class FileReader {
	private int[][] map;
	private String fileName;
	private int numOfRows;
	private int numOfColumns;
	private int startPositionCol;
	private int startPositionRow;
	
	public FileReader (String fileName, int numOfRows, int numOfColumns) {
		this.fileName = fileName;
		this.numOfRows = numOfRows;
		this.numOfColumns = numOfColumns;
		this.map = new int[numOfRows][numOfColumns];
	}
	
	public void ParseFile() {
		try {
			Scanner scanner = new Scanner(new File(this.fileName));
			scanner.useDelimiter("");
			
			System.out.println(this.numOfColumns);
			System.out.println(this.numOfRows);
			
			for (int i = 0; i < this.numOfRows; i++) {
				for (int j = 0; j < this.numOfColumns; j++) {
					map[i][j] = scanner.nextInt();
					
					if (map[i][j] == 2) {
						startPositionCol = j;
						startPositionRow = i;
					}
				}
				if (scanner.hasNextLine()) {
					scanner.nextLine();
				}
			}
			
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int[][] getMap() {
		return map;
	}

	public int getStartPositionCol() {
		return startPositionCol;
	}

	public int getStartPositionRow() {
		return startPositionRow;
	}
}
