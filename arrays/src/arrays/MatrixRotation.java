// NxN matrix rotation by 90 degrees

package arrays;

public class MatrixRotation {
	public static void main(String[] args) {
		int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] result = matrixRotation(mat, 3);
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		int[][] result2 = matrixRotationInPlace(mat, 3);
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				System.out.print(result2[i][j] + " ");
			}
			System.out.println("");
		}
	}
	public static int[][] matrixRotation(int[][] mat, int size) {
		int k = 0, l = 0;
		int[][] res = new int[size][size]; 
		for(int j = 0; j < size; j++) {
			for(int i = size - 1; i >= 0; i--) {
				res[k][l] = mat[i][j];
				l++;
			}
			k++;
			l = 0;
		}
		return res;
	}	
	public static int[][] matrixRotationInPlace(int[][] mat, int n) { // in place
		for(int layer = 0; layer < n/2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				// save top
				int top = mat[first][i];
				// left -> top
				mat[first][i] = mat[last - offset][first];
				// bottom -> left
				mat[last - offset][first] = mat[last][last - offset];
				// right -> bottom
				mat[last][last - offset] = mat[i][last];
				// top -> right
				mat[i][last] = top;
			}
		}
		return mat;
	}
}