package homeassignments3;

import java.util.Arrays;

public class LargestNumber {
	 
	public static void main(String[] args) {
		
		int[] Array = {3,2,11,4,6,7};
		Arrays.sort(Array);
		System.out.println(Arrays.toString(Array));
		int value  = Array[4];
		System.out.println("Value of the last second value :" +value);
	} 
}