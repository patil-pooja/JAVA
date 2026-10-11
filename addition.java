import java.util.Scanner;
class addition
{
    Scanner s = new Scanner(System.in);
    int a, b, add;
    void input()
    {
        System.out.println("Enter Two numbers ");
        a = s.nextInt();
        b = s.nextInt();
    }
    void calculate()
    {
        add = a+b;
        System.out.println("Addition = "+add);
    }
    public static void main(String args[])
    {
        addition ad = new addition();
        ad.input();
        ad.calculate();
    }
}