import java.io.*;
import java.util.*;
public class New{
	public static void main(String [] args) throws IOException
	{
	    int i,n,a,b;
		Scanner sc=new Scanner(System.in);
		n= sc.nextInt();
		
		

		for (i=0;i<n ;i++ )  
		{
			a=sc.nextInt();
			b=sc.nextInt();
			if(Math.abs(a-b)==2||(a+1)/2==(b+1)/2)
				System.out.println("YES");
			
			else System.out.println("NO");


		}		
			
	}
}