import java.util.Scanner;

class reverse {
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("enter a number : ");
		int n = ob.nextInt();
		
		System.out.println();
		
		for (; n > 0; n = n/10)
		{
			System.out.print(n % 10);
		}
	}
}