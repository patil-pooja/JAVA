public class finalMethod 
{
    final void disp()
    {
        System.out.println("Super class");
    }
}
class finalex extends finalMethod
{
    void print()
    {
        System.out.println("sub class");
    }
    public static void main(String[] args) {
        finalex ob = new finalex();
        ob.print();
        ob.disp();
    }
}
