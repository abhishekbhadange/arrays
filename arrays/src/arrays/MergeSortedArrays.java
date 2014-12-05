package arrays;

public class MergeSortedArrays {
	public static void main(String[] args) {
		int[] a = {4, 5, 20, 23, 30};
		int[] b = {-1, 9, 15, 18, 99};
		int[] result = mergeSortedArrays(a, b);
		for(int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
	}
	private static int[] mergeSortedArrays(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length) {
			if(a[i] < b[j]) {
				result[k] = a[i];
				i++;
			}
			else {
				result[k] = b[j];
				j++;
			}
			k++;
		}
		while(i < a.length) {
			result[k] = a[i];
			i++;
			k++;
		}
		while(j < b.length) {
			result[k] = b[j];
			j++;
			k++;
		}
		return result;
	}
}
