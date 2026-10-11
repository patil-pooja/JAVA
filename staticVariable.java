public class staticVariable 
{
    int eid;
    String name;
    static String city="solapur";
    staticVariable(int id, String n)
    {
        eid = id;
        name = n;
    }    
    void disp()
    {
        System.out.println(eid + " " + name + " " + city);
    }
    public static void main(String[] args) {
        staticVariable ob1 = new staticVariable(1,"xyz");
        staticVariable ob2 = new staticVariable(2, "pqr");
        ob1.disp();
        ob2.disp();
        System.out.println("city = "+staticVariable.city);
    }
}

