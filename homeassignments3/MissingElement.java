package homeassignments3;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
	
		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 10, 6, 8));
		int n=10;
		boolean [] missing = new boolean[n+1];
		for  (int i=0;i<array.size();i++) {
			missing[array.get(i)]= true;
		}
		System.out.println("Missing elements are :");
		for (int i=1;i<=n;i++) {
			if(!missing[i]) {
				System.out.println(i);
			}
		}
		
		
	}
	
}

