//passing current object  as a parameter using this keyword

class nameInto {
    void show(student3 s) {
        System.out.println("student name: " + s.name);
    }
}
class student3 {
    String name;

    student3(String name) {
        this.name = name;
    }

    void print() {
        nameInto n = new nameInto();
        n.show(this);
    }
    
    public static void main(String[] args) {
        student3 s = new student3("pooja");
        s.print();
    }
}

