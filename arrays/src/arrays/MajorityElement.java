/*Majority Element: A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).

Write a function which takes an array and emits the majority element (if it exists), otherwise prints NONE as follows:

       I/P : 3 3 4 2 4 4 2 4 4
       O/P : 4 

       I/P : 3 3 4 2 4 4 2 4
       O/P : NONE*/
	   
package arrays;

import java.util.Map;
import java.util.HashMap;

public class MajorityElement {
	public static void main(String[] args) {
			int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
			int result = majorityElement(arr);
			if(result != Integer.MIN_VALUE)
				System.out.println(result);
			else
				System.out.println("NONE");
	}
	public static int majorityElement(int[] arr) {
		if(arr.length == 0 || arr.length == 1) {
			System.out.println("Error: Input array's length is less than 2.");
			System.exit(0);
		}
		Integer count;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++) {
			if((count = map.get(arr[i])) != null) {
				count += 1;
				map.put(arr[i], count);
			}
			else
				map.put(arr[i], 1);
			count = 0;
		}
		for(Map.Entry<Integer, Integer> me : map.entrySet()) {
			if(me.getValue() > arr.length/2)
				return me.getKey();
		}
		return Integer.MIN_VALUE;
	}
}