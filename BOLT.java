import java.util.*;
public class BOLT 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for (int a=0;a<n ;a++ ) 
		{
			float k1 = sc.nextFloat();
			float k2 = sc.nextFloat();
			float k3 = sc.nextFloat();
			float v = sc.nextFloat();
			double u=Math.round ((100/(k1*k2*k3*v))*100 ) /100.0;	
			if(u<9.58)
				System.out.println("YES");
			else
				System.out.println("NO");

		}

	}
}