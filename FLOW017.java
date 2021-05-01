import java.util.*;

public class FLOW017
{
	public static void main(String[] args) {
		int i,n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		for (i=0;i<n;i++ ) 
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println((a>b)?((b>c)?b:((a>c)?c:a)):(a>c)?a:((b>c)?c:b));
		}
	}
}