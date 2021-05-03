import java.util.*;

public class PALL01
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []a = new int[n];
		for (int i=0;i<n ; i++) {
			a[i]=sc.nextInt();			
		}
		for (int i=0; i<n; i++ ) {
			int t=a[i];
			int c=0;
			while(t!=0)
			{
				c=c*10+t%10;
				t/=10;
			}
			if (c==a[i]) {
				System.out.println("wins");
			}
			else
			{
				System.out.println("loses");
			}			
		}

	}
}