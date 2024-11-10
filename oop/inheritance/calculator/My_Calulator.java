package oop.inheritance.calculator;

public class My_Calulator extends Calculation {
    public void multiplication (int x, int y)
    {
        z = x * y;
        System.out.println("This is the multiplication = "+z);
    }


    public static void main(String[] args)
    {
        My_Calulator instance = new My_Calulator();

        instance.multiplication(10, 2);
    }
}
