import java.util.*;

public class PRB01
{
	static int isPrime(int x) {
    	for (int d = 2; d * d <= x; d++) {
        	if (x % d == 0)
        	    return 0;
    	}
    	return 1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    int n=s.nextInt();
		    int flag=0;
		    if(n==0 || n==1)
		    System.out.println("no");
		    else{
		      for(int i=2;i<n/2;i++)
		    {
		        if(n%i==0)
		        {
		        flag=1;
		        break;
		        }
		    }
		    
		    if(flag==1)
		    System.out.println("no");
		    else
		    System.out.println("yes");
		    }
		}
/*This algorithm is not accepting in codechef if annyone finds solution can share		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []a = new int[n];
		for (int i=0;i<n ; i++) {
			a[i]=sc.nextInt();			
		}
		for (int i=0;i<n ;i++ ) {
			if(isPrime(a[i])==0)
				System.out.println("no");
			else
				System.out.println("yes");
			
		}
*/

	}
}