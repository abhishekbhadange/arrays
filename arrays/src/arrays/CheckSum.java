//Given an array A[] and a number x, check for pair in A[] with sum as x

package arrays;

import java.util.Map;
import java.util.HashMap;

public class CheckSum {	
	public static void main(String[] args) {
		int[] A = {2, 13, 24, 5, 10};
		int x = 18;
		boolean result = checkSumUsingHash(A, x);
		System.out.println(result);
		boolean result2 = checkSumUsingSort(A, x);
		System.out.println(result2);
	}
	public static boolean checkSumUsingHash(int[] A, int x) {	// Time complexity - O(n)
		if(A == null || A.length < 2)
			return false;
		int i, flag = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(i = 0; i < A.length; i++)
			map.put(A[i], i);
		for(i = 0; i < A.length; i++) {
			if(map.get(x - A[i]) != null && map.get(x - A[i]) != i) {
				System.out.println("Pair " + A[i] + ", " + A[map.get(x - A[i])] + " has sum " + x);
				flag = 1;
			}
		}	
		if(flag == 1)
			return true;
		return false;
	}
	public static boolean checkSumUsingSort(int[] A, int x) {	// Time complexity - O(nlog(n))
		if(A == null || A.length < 2)
			return false;
		int i, j, flag = 0;
		int left = 0, right = A.length - 1;
		java.util.Arrays.sort(A);
		while(left < right) {
			i = A[left];
			j = A[right];
			if(i + j == x) {
				System.out.println("Pair " + i + ", " + j + " has sum " + x);
				flag = 1;
				left++;
				right--;
			}
			else if(i + j < x) 
				left++;
			else
				right--;
		}
		if(flag == 1)
			return true;
		return false;
	}
}
