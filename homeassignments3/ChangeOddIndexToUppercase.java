package homeassignments3;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		 String test = "changeme";
		 char[] name = test.toCharArray();
		 
		 for (int i=0;i<name.length;i++) {
			 if (i%2!=0) {
				 name[i]=Character.toUpperCase(name[i]);
				 
			 }
			 
		 }
		 System.out.println(new String(name));
	}
}
