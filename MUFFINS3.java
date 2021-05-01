import java.util.*;
import java.lang.*;
public class MUFFINS3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int [] a = new int[n];
		for (int i=0; i<n ;i++ ) 
		{
			int b = sc.nextInt();
			a[i]=b/2+1;
		}
		for (int i=0;i<n ;i++ ) {
			System.out.println(a[i]);
		}
	}
}