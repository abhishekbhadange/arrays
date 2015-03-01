package arrays;

public class ResetRowCol2 {
	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3, 4}, {5, 0, 6, 7}, {8, 9, 10, 11}};
		System.out.println("Using O(1) space complexity algorithm: ");
		setZeroConstantSpace(matrix);
	}
	// space complexity: O(1)
	public static void setZeroConstantSpace(int[][] matrix) {
		boolean columnHasZero = false; 
		boolean rowHasZero = false;
		for(int i = 0; i < matrix.length; i++) {
			if(matrix[i][0] == 0) {
				columnHasZero = true;
				break;
			}
		}
		for(int j = 0; j < matrix[0].length; j++) {
			if(matrix[0][j] == 0) {
				rowHasZero = true;
				break;
			}
		}
		for(int i = 1; i < matrix.length; i++) {
			for(int j = 1; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		for(int i = 0; i < matrix.length; i++) {
			if(matrix[i][0] == 0) 
				nullifyRow(matrix, i);
		}
		for(int j = 0; j < matrix[0].length; j++) {
			if(matrix[0][j] == 0)
				nullifyColumn(matrix, j);
		}
		if(rowHasZero)
			nullifyRow(matrix, 0);
		if(columnHasZero)
			nullifyColumn(matrix, 0);
		printMatrix(matrix);
	}
	public static void nullifyRow(int[][] matrix, int row) {
		for(int j = 0; j < matrix[0].length; j++)
			matrix[row][j] = 0;
	}
	public static void nullifyColumn(int[][] matrix, int column) {
		for(int i = 0; i < matrix.length; i++)
			matrix[i][column] = 0;
	}
	public static void printMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				Object[] obj = new Object[1];
				obj[0] = new Integer(matrix[i][j]);
				System.out.printf("%-6d", obj);
				obj = null;
			}
			System.out.println("");
		}
	}
}
