import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int s = 0;

        int Arr[] = new int[6];
        for (int i = 0; i < Arr.length; i++)
        {
            System.out.println("enter number : ");
            Arr[i] = ob.nextInt();
        }

        for (int j = 0; j < Arr.length; j++)
        {
            s = s + Arr[j];
        }
        System.out.println(s);
        System.out.println(s / Arr.length);
    }
}
