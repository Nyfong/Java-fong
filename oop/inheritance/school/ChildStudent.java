package oop.inheritance.school;

public class ChildStudent  extends Classroom{
    public String stuName;
    public void greetingStudent()
    {
        System.out.println("Hello "+ stuName);
        greeting();
    }
    public static void main(String [] args)
    {
        ChildStudent instance = new ChildStudent();
        instance.stuName = "Sokkha ";
        instance.greetingStudent();
    }
}
