import java.util.*;
public class AMR15A
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int o=0,e=0;
		int a[]= new int[n];
		for (int i=0 ; i<n ; i++) {
			a[i]=sc.nextInt();				
		}
		for (int i=0 ; i<n ; i++) {
			if(a[i]%2==0)				
				e++;
			else
				o++;
		}
		if(e>o)
			System.out.println("READY FOR BATTLE");
		else 
			System.out.println("NOT READY");
	}
}