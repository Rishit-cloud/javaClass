package programs.loop;

import java.util.*;

class fidbonaci
{
    public static void main(String args[])
    {
        System.out.print("enter a number : ");
	Scanner ob = new Scanner(System.in);
	int n = ob.nextInt();
	int a = -1, b = 1, c = 0;
	for (int i = 1; i <= n; i++)
	{
	    c = a + b;
	    System.out.println(c + " ");
	    a = b;
	    b = c;
	}
    }
}