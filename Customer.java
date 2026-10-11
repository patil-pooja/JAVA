import java.util.*;
public class Customer
{
    Scanner s = new Scanner(System.in);
    private String name,email;
    private Long phonenumber;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public static void main(String args[])
    {
        Customer c = new Customer();

        System.out.print("Enter name: ");
        String inputName = c.s.nextLine();

        System.out.print("Enter email: ");
        String inputEmail = c.s.nextLine();

        System.out.print("Enter phone number: ");
        long inputPhonenumber = c.s.nextLong();

        c.setName(inputName);
        c.setEmail(inputEmail);
        c.setPhonenumber(inputPhonenumber);

        System.out.println("Customer Details");
        System.out.println("Name: "+c.getName());
        System.out.println("Email: "+c.getEmail());
        System.out.println("Phone Number: "+c.getPhonenumber());
    }
}