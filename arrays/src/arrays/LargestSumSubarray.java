//Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.

package arrays;

public class LargestSumSubarray {
	public static void main(String[] args) {
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		int result = largestSubarraySum(arr);
		System.out.println("Maximum Sub-Sequence Sum: " + result);
	}
	public static int largestSubarraySum(int[] arr) {
		int[] sum = new int[arr.length];
		int[] start = new int[arr.length];
		int startIndex = 0, maxSum = Integer.MIN_VALUE, i, index = 0;
		String result = "";
		for(i = 0; i < arr.length; i++) {
			if(i - 1 < 0)
				sum[i] = arr[i];
			else {
				sum[i] = java.lang.Math.max(sum[i - 1] + arr[i], arr[i]);
				if(sum[i] == arr[i])
					startIndex = i;
				start[i] = startIndex;
			}
		}
		for(i = 0; i < arr.length; i++) {
			if(maxSum < sum[i]) {
				maxSum = sum[i];
				index = i;
			}
		}
		for(i = start[index]; i <= index; i++) {
			result += String.valueOf(arr[i]);
			result += " ";
		}
		System.out.println(result);
		return maxSum;
	}
}