import java.util.*;

public class CIELRCPT
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n ;i++ ) {
			a[i]= sc.nextInt();			
		}
		for (int i=0; i<n ;i++ ) {
			int ans=0,max=2048;
			while(a[i]!=0)
			{
				ans+= a[i]/max;
				a[i]%=max;
				max/=2;
			}
			System.out.println(ans);
			
		}
	}
}