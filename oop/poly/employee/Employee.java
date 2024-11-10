package oop.poly.employee;
public class Employee {
    private String name;
    private String address;
    private int number;
    public Employee(String name, String address, int number)
    {
        System.out.println("Constructing an Employee");
            this.address = address;
            this.name = name;
            this.number= number;
    }

    public String getName ()
    {
        return name;
    }
    public String getAdress ()
    {
        return address;
    }
    public int getNumber() {
        return number;
     }
     public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
     }
}