import java.util.*;

public class buzzOrNot {

    Scanner s = new Scanner(System.in);
    int n;

    void get()
    {
        System.out.println("Enter a number: ");
        n = s.nextInt();
    }
    void check()
    {
        if(n%10==7 || n%7==0)
        {
            System.out.println(n + " is a Buzz number");
        }
        else
        {
            System.out.println(n + "  is Not a Buzz number");
        }
    }
    public static void main(String args[])
    {
        buzzOrNot b = new buzzOrNot();
        b.get();
        b.check();
    }
}
