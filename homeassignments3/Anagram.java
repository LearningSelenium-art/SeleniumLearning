package homeassignments3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss";
		
		if  (text1.length()==text2.length()) {
			
			char[] cArray= text1.toCharArray();
			char[] cArray1=text2.toCharArray();
			Arrays.sort(cArray);
			Arrays.sort(cArray1);
			
			if (Arrays.equals(cArray, cArray1)) {
			
			System.out.println("These Strings are Anagram");
			}
			else {
				System.out.println("These Strings are not an Anagram");
			}
	}
	
	
	
	
	
	}}

