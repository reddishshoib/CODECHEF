import java.util.*;
public class FLOW013
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][]= new int[n][3];
		for (int i=0; i<n ; i++ ) 
		{			
			a[i][0]= sc.nextInt();
			a[i][1]= sc.nextInt();
			a[i][2]= sc.nextInt();			
		}
		for (int i=0 ; i<n ; i++ ) 
		{
			if(a[i][0]+a[i][1]+a[i][2]==180	)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}