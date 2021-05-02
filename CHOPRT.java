import java.util.*;
public class CHOPRT
{
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		char[] c = new char[n];
		for (int i=0; i<n; i++ ) 
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a>b)
				c[i]='>';
			else if(a<b)
			{
				c[i]='<';
			}
			else
			{
				c[i]='=';
			}
		}
		for (int i=0; i<n ;i++ ) {
			System.out.println(c[i]);
			
		}
	}
}