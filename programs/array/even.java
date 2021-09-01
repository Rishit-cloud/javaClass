package programs.array;

import java.util.Scanner;

class even{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		
		int nums[] = new int[6];
		
		for (int i = 0; i <= 5; i++)
		{
			System.out.print("Enter number : ");
			nums [i] = ob.nextInt();
		}
		
		System.out.println();

		for (int i = 0; i <= 5; i++)
		{
			if (nums[i] % 2 == 0)
			{
				System.out.println(nums[i] + " is even");
			}
		}
	}
}