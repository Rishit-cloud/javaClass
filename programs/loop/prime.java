package programs.loop;

import java.util.*;

class prime
{
    public static void main(String a[])
    {
        System.out.print("enter a number : ");
	Scanner ob = new Scanner(System.in);
	int n = ob.nextInt();
	int f = 0;
	for (int i = 1;i <= n; i++)
	{
	    if(n % i == 0)
	    {
			f++;
	    }
	}
	if (f == 2)
	{
	    System.out.println(n + " is prime");
	}
	else
	{
	    System.out.println(n + " is not prime");
	}
    }
}