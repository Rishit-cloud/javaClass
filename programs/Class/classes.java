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
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        classes ob = new classes(b);
        System.out.println();
        ob.func();
    }
}
