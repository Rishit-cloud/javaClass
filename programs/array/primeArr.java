import java.util.Scanner;

class primeArr
{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int f = 0;

        int Arr[] = new int[4];
        for (int i = 0; i < 4; i++)
        {
            System.out.print("enter number : ");
            Arr[i] = ob.nextInt();
        }

        System.out.println();

        for (int i = 0; i < 4; i++) 
        {
            f = 0;
            for (int j = 1; j < Arr[i]; j++)
            {
                if(Arr[i] % j == 0)
                    f++;
            }

            if (f == 2)
            {
                System.out.println(Arr[i] + " is prime");
                f = 0;
            }
        }
    }
}