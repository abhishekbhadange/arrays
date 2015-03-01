package arrays;

public class MatrixRotation2 {
	public static void main(String[] args) {
		int[][] image = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println("Rotated image using additional data structure: ");
		rotateImage(image);
		System.out.println("Rotated image using in-place algorithm: ");
		rotateImageInPlace(image);
	}
	public static void rotateImage(int[][] image) {
		int N = image.length;
		int[][] newImage = new int[N][N];
		int m = 0, n = N-1;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				newImage[m][n] = image[i][j];
				m++;
			}
			n--;
			m = 0;
		}
		printImage(newImage);
	}
	public static void printImage(int[][] image) {
		int n  = image.length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(image[i][j] + " ");
			}
			System.out.println("");
		}
	}
	// formula: row = j, column = n-1-i
	public static void rotateImageInPlace(int[][] image) {
		int n = image.length;
		for(int i = 0; i < n/2; i++) {
			for(int j = i; j < n-1; j++) {

				// save top right
				int temp = image[j][n-1-i];

				// top right = top left
				image[j][n-1-i] = image[i][j];

				// save bottom right
				int temp2 = image[n-1-i][n-1-j];

				// bottom right = top right
				image[n-1-i][n-1-j] = temp;

				// save bottom left
				temp = image[n-1-j][i];

				// bottom left = bottom right
				image[n-1-j][i] = temp2;

				// top left = bottom left
				image[i][j] = temp;
			}
		}
		printImage(image);
	}
}
