import java.util.*;

public class FSQRT
{
	public static void main(String[] args) {
		int n,a;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i=0;i<n;i++) {
			a=sc.nextInt();
			System.out.println(Math.round(Math.sqrt(a)));
		}
	}
}