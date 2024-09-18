package homeassignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FibonacciSeries is addition of the previous two numbers. 0 and 1 are the first two  default numbers
		int number = 8,a=0,b=1,lastnumber=0;

		

for (int i=2;i<number;i++) {
	//Additon of this two numbers should be stored in the final variable
	lastnumber =a+b;
	a=b;
	b=lastnumber;
	System.out.println(lastnumber);
}
	}

}
