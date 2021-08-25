import java.util.*;

class asdfjkl
{
    public static void main(String args[])
    {
	int a = 1, c = 0;
	char ch = 'a';
        System.out.print("enter a number : ");
	Scanner ob = new Scanner(System.in);
	int n = ob.nextInt();
	for (int i = 0; i < n; i++)
	{
	    System.out.print(a++ + " ");
	    c++;
	    if (c == 3)
	    {
		System.out.print(ch + " ");
		ch++;
		c = 0;
	    }
	}
    }
}