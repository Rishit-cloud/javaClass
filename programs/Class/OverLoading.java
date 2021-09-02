public class OverLoading {

    int i = 0;
    OverLoading()
    {
        System.out.println("Default Constructor");
    }

    OverLoading(int i)
    {
        this.i = i;
    }

    void func()
    {
        System.out.println(i);
    }

    void func2()
    {

    }

    public static void main(String[] args) 
    {
        OverLoading ob = new OverLoading();
        ob.func2();
        OverLoading ob2 = new OverLoading(30);
        ob2.func();
    }

}
