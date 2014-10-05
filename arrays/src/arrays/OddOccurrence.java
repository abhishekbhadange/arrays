//Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times. 
//Find the number in O(n) time & constant space.

package arrays;

import java.util.HashSet;

public class OddOccurrence {
	public static void main(String[] args) {
		int[] arr = {4, 2, 7, 9, 4, 2, 4, 9, 4};
		int result = getOdd(arr);
		if(result != Integer.MIN_VALUE)
			System.out.println(result);
		else
			System.out.println("NONE");
		int result2 = odd(arr);
		if(result2 != Integer.MIN_VALUE)
			System.out.println(result2);
		else
			System.out.println("NONE");
	}
	public static int getOdd(int[] a) {
		int res = 0;
		for(int i = 0; i < a.length; i++)
			res = res ^ a[i];
		if(res != 0)
			return res;
		return Integer.MIN_VALUE;
	}
	public static int odd(int[] a) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < a.length; i++) {
			if(set.contains(a[i])) 
				set.remove(a[i]);
			else
				set.add(a[i]);
		}
		if(set.iterator().hasNext())
			return set.iterator().next();
		return Integer.MIN_VALUE;
	}
}