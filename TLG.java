import java.util.*;
public class TLG
{
	public static void main(String[] args) {
		int n,p1=0,p2=0,wn=0,wd=0;
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		for (int i=0; i<n ; i++ ) 
		{
			int s=sc.nextInt();
			int l=sc.nextInt();
			p1=p1+s;
			p2=p2+l;

			if(wd<p1-p2 && p1>p2)
			{
				wn=1;
				wd=p1-p2;	
			}
			else if(wd<p2-p1 && p2>p1)
			{
				wn=2;
				wd=p2-p1;
			}
			

		}
		System.out.println(wn + " "+wd);
	}
}
