import java.util.Scanner;

public class substraction {
    int a, b, sub;
    Scanner s=new Scanner(System.in);
    
    void input()
    {
        System.out.println("Enter Two number : ");
        a = s.nextInt();
        b = s.nextInt();
    }

    void calculate()
    {
        sub=a-b;
        System.out.print("Substraction is = "+sub);
    }

    public static void main(String args[])
    {
        substraction su=new substraction();
        su.input();
        su.calculate();
    }
}
