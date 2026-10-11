interface Vehical
{
    void show();
}
class Car implements Vehical
{
    public void show()
    {
       System.out.println("Vehical Name is: Car"); 
    }
}
class Bike extends Car
{
    public void show() 
    {
        System.out.println("Vehical Name is: Bike");
    }
    public static void main(String args[])
    {
        Vehical c = new Car();
        Vehical b = new Bike();
        c.show();
        b.show();
    }
}