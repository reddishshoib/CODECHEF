import java.util.*;

public class FLOW008
{
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		n =sc.nextInt();
		int a[] = new int[n];
		for (int i =0; i<n ;i++ ) 
		{
			a[i]=sc.nextInt();

		}
		for (int i=0;i<n ;i++ ) 
		{
			if (a[i]<10) {
				System.out.println("Thanks for helping Chef! ");				
			}
			else
				System.out.println("-1");
		}
		
	}
}