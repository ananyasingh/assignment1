import java.io.*;
import java.util.Scanner;
public class numtoword
{
	public static void main(String args[])throws IOException
	{
	    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		int n,h,u,t,t1,x;
		String a[]=new String[20];
		String b[]=new String[8];
		System.out.println("Enter the number");
		n=Integer.parseInt(obj.readLine());
		if(n>=1000)
			{System.out.println("enter no less than 1000");
			}
		else
		{
			a=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eightneen","ninteen"};
			b=new String[]{"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
			u=n%10;
			t=n%100;
			t1=(t-u)/10;
			h=(n-t)/100;
			if(n>=0 && n<=19)
				System.out.println(a[n]);
			else if (n>=20 && n<=99)
			{
				if(u==0)
				System.out.println(b[t1-2]);
				else
				System.out.println(b[t1-2] + "  " +  a[u]);
			}
			else if(n>=100 && n<=999)
			{
				if(t==0 && u==0)
					System.out.println(a[h] +" hundred ");
				else if(u==0 && t!=0)
					System.out.println(a[h] + " hundred " + b[t1-2]);
				else
					System.out.println(a[h]+ " hundred and " + b[t1-2] + " " +a[u]);
				
			}
		}	
	}
}

   
