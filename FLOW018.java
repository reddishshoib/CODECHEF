import java.util.*;
public class FLOW018
{
	static int fact(int a)
	{
		if(a==0)
			return 1;
		else 
		{
			return a*(fact(a-1));
		}
	}
	public static void main(String[] args) 
	{
		int n;
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n ;i++ ) 
		{
			int no= sc.nextInt();
			a[i]=fact(no);
		}

		for (int i=0;i<n ;i++ ) {
			System.out.println(a[i]);
		}
	}
}