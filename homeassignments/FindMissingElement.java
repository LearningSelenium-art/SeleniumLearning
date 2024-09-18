package homeassignments;

import java.util.Arrays;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={1,4,3,2,8,6,7};
int sum=0;
//Arrays.sort(a);

for (int i=0;i<a.length;i++) 
{
	sum=sum+a[i];
	}
int sum1=0;
for (int i=1;i<=8;i++) {
	sum1=sum1+i;
}
System.out.println(" This is the Missing Number :" + (sum1-sum));
}

	


}
