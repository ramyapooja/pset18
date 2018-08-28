import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int r=m^n;
		String s="";
		int a,c=0;
		while(r>0)
		{
			a=r%2;
			s=s+""+a;
			r=r/2;
		}		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1')
			{
				c++;
			}
		}
		System.out.println(c);
	}
}
