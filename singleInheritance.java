class superClass
{
    void disp()
    {
        System.out.println("Super class");
    }    
}
class childClass extends superClass
{
    void print()
    {
        System.out.println("child class");
    }
    public static void main(String[] args) {
        childClass ob = new childClass();
        ob.disp();
        ob.print();
    }
}
