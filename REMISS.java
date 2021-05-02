import java.util.*;
public class REMISS
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a[][]= new int[n][2];
		for (int i=0; i<n ; i++ ) 
		{			
			a[i][0]= sc.nextInt();
			a[i][1]= sc.nextInt();
			
		}
		for (int i=0 ; i<n ; i++ ) 
		{
			if (a[i][0]>a[i][1]) {
				a[i][1]=a[i][0]+a[i][1];
				System.out.println(a[i][0]+" "+a[i][1]);
			}
			else
			{
				a[i][0]=a[i][0]+a[i][1];
				System.out.println(a[i][1]+" "+a[i][0]);
			}
		}
	}
}