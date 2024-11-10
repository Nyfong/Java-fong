package oop.inheritance.school;

public class ChildStudent  extends Classroom{
    public String stuName;
    public void greetingStudent()
    {
        System.out.println("Hello "+ stuName);
        
    }
    public void greeting()
    {
        
        System.out.println("hello i am a student");
    }
    public void  callGreeting ()
    {
        greeting();
        super.greeting(); //super use to call the same method that parent class have
    }
    public static void main(String [] args)
    {
        ChildStudent instance = new ChildStudent();
        instance.stuName = "Sokkha ";
        instance.greetingStudent();
        instance.callGreeting();
      
    }
   
}
