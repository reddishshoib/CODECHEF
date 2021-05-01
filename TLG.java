import java.util.*;
public class TLG
{
	public static void main(String[] args) {
		int n,p1,p2,w=0,d=0,wn=0,wd=0;
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		for (int i=0; i<n ; i++ ) 
		{
			p1=sc.nextInt();
			p2=sc.nextInt();
			if(p1>p2)
			{
				w=1;
				d=p1-p2;	
			}
			else 
			{
				w=2;
				d=p2-p1;
			}
			if(d>wd)
			{
				wn=w;
				wd=d;
			}

		}
		System.out.println(wn + " "+wd);
	}
}