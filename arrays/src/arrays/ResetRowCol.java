// Write an algorithm such that if an element in an MxN matrix is
// 0, its entire row and column are set to 0.

package arrays;

public class ResetRowCol {
	public static void main(String[] args) {
		int[][] mat = {{1, 2, 3, 4}, {5, 6, 0, 8}, {9, 10, 11, 12}, {0, 2, 56, 87}};
		int[][] result = resetRowCol(mat);
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				if(String.valueOf(result[i][j]).length() > 1)
					System.out.print(result[i][j] + "  ");
				else
					System.out.print(result[i][j] + "   ");
			}
			System.out.println("");
		}
	}
	public static int[][] resetRowCol(int[][] mat) {
		boolean[] rows = new boolean[mat.length];
		boolean[] columns = new boolean[mat[0].length];
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				if(mat[i][j] == 0) {
					rows[i] = true;
					columns[j] = true;
				}
			}
		}
		for(int i = 0; i < rows.length; i++)
			if(rows[i])
				nullifyRow(mat, i);
		for(int j = 0; j < columns.length; j++)
			if(columns[j])
				nullifyColumn(mat, j);
		return mat;
	}
	public static void nullifyRow(int[][] mat, int row) {
		for(int k = 0; k < mat[0].length; k++)
			mat[row][k] = 0;
	}
	public static void nullifyColumn(int[][] mat, int col) {
		for(int k = 0; k < mat.length; k++)
			mat[k][col] = 0;
	}
} 