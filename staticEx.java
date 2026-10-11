public class staticEx {

    int a;
    static int p;
    void display()
    {
        System.out.println("a = "+a + " p = "+p);
        a++;
        p++;
    }
    public static void main(String args[])
    {
        staticEx ob = new staticEx();
        ob.display();
        ob.display();
        staticEx ob1 = new staticEx();
        ob1.display();
    }   
}
