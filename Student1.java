import java.util.*;
public class Student1 {

    Scanner s = new Scanner(System.in);

    String name;
    int age, rollno;
    
    void input() {
        System.out.print("Enter name: ");
        name=s.nextLine();
        System.out.print("Enter age: ");
        age=s.nextInt();
        System.out.print("Enter rollno: ");
        rollno=s.nextInt();
    }
    
    void display() {
        System.out.println("name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Rollno is: "+rollno);
    }
    public static void main(String args[]) {
        Student1 stud = new Student1();
        stud.input();
        stud.display();
    }
}
