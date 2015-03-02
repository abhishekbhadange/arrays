package arrays;

public class DifferentElements {
	public static void main(String[] args) {
		int[] arr1 = {2, 5, 9, 10, 15, 18};
		int[] arr2 = {2, 5, 7, 9, 10, 15, 18, 19};
		printDifferentElements(arr1, arr2);
	}
	public static void printDifferentElements(int[] arr1, int[] arr2) {
		int[] biggerArray;
		int[] smallerArray;
		int n;
		if(arr1.length > arr2.length) {
			biggerArray = arr1;
			smallerArray = arr2;
			n = arr2.length;
		}
		else {
			biggerArray = arr2;
			smallerArray = arr1;
			n = arr1.length;
		}
		int count = 0;
		int i = 0;
		int j = 0;
		while(i < n) {
			if(smallerArray[i] == biggerArray[j]) {
				i++;
				j++;
			}
			else {
				System.out.print(biggerArray[j] + " ");
				count++;
				j++;
			}
		}
		if(count == 1) {
			if(biggerArray[biggerArray.length-2] == smallerArray[smallerArray.length-1])
				System.out.print(biggerArray[biggerArray.length-1] + " ");
			else
				System.out.print(biggerArray[biggerArray.length-2] + " ");
		}
		else if(count == 0) {
			System.out.print(biggerArray[biggerArray.length-2] + " ");
			System.out.print(biggerArray[biggerArray.length-1] + " ");
		}
	}
}