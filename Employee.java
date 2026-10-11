class Person {
    void disp() {
        System.out.println("Person Class");
    }
}
class Employee extends Person {
    void disp() {
        System.out.println("Employee Class");
    }
    public static void main(String args[]) {
        Person ob = new Employee();
        ob.disp();
    }
    
}
