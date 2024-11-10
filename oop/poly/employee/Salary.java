package oop.poly.employee;
public class Salary  extends Employee{
    private double salary;
    
    public Salary (String name, String address, int number, double salary)
    {
        super(name, address, number);
        setSalary(salary);

    }
    public double  setSalary ()
    {
        return salary;
    }
    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName()
        + " with salary " + salary);
     }
    public void setSalary(double newSalary)
    {
        if(newSalary >= 0.0)
        {
            salary = newSalary;
        }
    }
    public static void main(String[] args)
    {
        Salary obj = new Salary("fong","a" , 1,3600.00 );
        obj.mailCheck();   
    }
}
