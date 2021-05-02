import java.util.*;

public class FLOW005
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n ;i++ ) {
			a[i]= sc.nextInt();			
		}
		int note[]= new int[]{1,2,5,10,50,100};
		for (int i=0; i<n ;i++ ) {
			int j=note.length-1;
			int max = note[j];
			int count =0;
			while (a[i]!=0) {
				if(a[i]>=max)
				{
					count++;
					a[i]-=max;
					if(a[i]==0)
						break;
				}
				else
				{
					
					max=note[--j];
				}
				
			}
			System.out.println(count);
			
		}
	}
}