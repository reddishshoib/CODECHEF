import java.util.*;
import java.util.regex.*;

public class SSCRIPT
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		Boolean[] s= new Boolean[t];
		for (int i=0;i<t ;i++ ) 
		{
			int size = sc.nextInt();
			int charsize= sc.nextInt();
			int counter=1;
			char[] a = sc.next().toCharArray();
			for (int j=0;j<a.length-1 ;j++ ) 
			{
				if(a[j]==a[j+1])
					counter++;
			}
			if(counter==charsize)
				s[i]=true;
			else
				s[i]=false;
		}
		for (int i=0; i<t ;i++ ) {
			if(s[i])
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}

	}
}