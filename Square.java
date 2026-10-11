import java.util.*;
class Shape {
    Scanner s = new Scanner(System.in);

    void print() {
        System.out.println("Area of shapes");
    }
}
class Circle extends Shape {
    void print() {
        double r;
        System.out.println("Area of Circle");
        System.out.print("Enter radius: ");
        r=s.nextDouble();
        System.out.println("Area of circle is: "+ 3.14*r*r);
    }
}

class Rectangle extends Shape {
    void print() {
        double l, b;
        System.out.println("\nArea of Rectangle");
        System.out.print("Enter length: ");
        l = s.nextDouble();
        System.out.print("Enter breadth: ");
        b = s.nextDouble();
        System.out.println("Area of rectangle is: " +(l*b));
    }
}

class Square extends Shape {
    void print() {
        double si;
        System.out.println("\nArea of square");
        System.out.print("Enter side: ");
        si = s.nextDouble();
        System.out.println("Area of square is: "+(si*si));
    }
    public static void main(String args[]) {
        Shape s1 = new Circle();
        s1.print();
        Shape s2 = new Rectangle();
        s2.print();
        Shape s3 = new Square();
        s3.print();
    }
}
