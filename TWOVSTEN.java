import java.util.*;
public class TWOVSTEN
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0 ; i<n  ; i++ ) {
			a[i]=sc.nextInt();
		}
		for ( int i=0 ; i<n  ; i++ ) 
		{
			if(a[i]%10==0)
				System.out.println(0);
			else if(a[i]%5 ==0 )
				System.out.println(1);
			else
				System.out.println(-1);
		}
	}
}