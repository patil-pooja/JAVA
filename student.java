//referencing instance variable using this keyword

public class student
{
    String name;
    student(String name)
    {
        this.name=name;
    }    
    void disp()
    {
        System.out.println("Student name = "+name);
    }
    public static void main(String[] args) {
        student s = new student("pooja");
        s.disp();
    }
}
