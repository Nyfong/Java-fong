package oop.inheritance.calculator;

public class Calculation {
    public int z;
    public void addition(int x, int y)
    {
        z = x + y;
        System.out.println("The sum of given number"+ z);
    }
    public void subtraction(int x, int y)
    {
        z = x - y;
        System.out.println("The subtraction of given number"+ z);
    }
}
