class Shape
{
    void draw()
    {
        System.out.println("Differents types of shapes");
    }
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("This is circle");
    }
}
class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("This is rectangle");
    }
}
class Triangle extends Shape
{
    void draw()
    {
        System.out.println("This is triangle");
    }
    public static void main(String args[])
    {
        Shape c = new Circle();
        c.draw();
        Shape r = new Rectangle();
        r.draw();
        Shape t = new Triangle();
        t.draw();
    }
}
