public class methodOverloading {
    
    void add() {
        int a=10,b=40,c;
        c=a+b;
        System.out.println("Addition is = "+c);
    }

    void add(int p,int q) {
        System.out.println("Addition is : "+(p+q));
    }

    public static void main(String[] args) {
        methodOverloading mo = new methodOverloading();
        mo.add();
        mo.add(5,8);
    }
}
