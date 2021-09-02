import java.util.Scanner;

class classes {
    int a = 0;
    classes(int a)
    {
        this.a = a;
        // System.out.println(this.a);
    }

    void func()
    {
        System.out.println("a = " + a);
    }

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int b = inp.nextInt();
        classes ob = new classes(b);
        System.out.println();
        ob.func();
    }
}
