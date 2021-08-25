import java.util.*;

class factorial
{
   public static void main(String a[])
   {
	Scanner ob = new Scanner(System.in);
	System.out.print("enter a number : ");
	int n = ob.nextInt();
	int f = 1;
	
	for(int i = 1; i <= n; i++)
	{
	    f=f*i;
	}
	System.out.println(f);
   }
}