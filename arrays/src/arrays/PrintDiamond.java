package arrays;

public class PrintDiamond {
	public static void main(String[] args) {
		printDiamond(7, '*');
	}
	public static void printDiamond(int n, char c) {
		for(int i = 0; i <= n/2; i++) {
			for(int j = 0; j < n/2 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= 2*i; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
		for(int i = n/2; i > 0; i--) {
			for(int j = 0; j <= n/2 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i - 1; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
