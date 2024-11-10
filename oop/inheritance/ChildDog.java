package oop.inheritance;

public class ChildDog extends Animal{
    /*
     * In this setup:
    ChildDog calls super.callName() to print the animal's name first.
    It then prints "This is a dog" to provide the specific behavior for ChildDog.
     */
    public ChildDog(String name)
    {
        super(name);
    }
   
    @Override
    public void callName() {
        System.out.println(" This is dog");
    }
    
    public static void main(String []  args)
    {
        ChildDog object = new ChildDog("nigga");
        object.age = 2;
        System.out.println(object.name);
        System.out.println("Dog age ="+object.age+" months.");
    }
}
