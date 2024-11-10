package oop.inheritance;
//parent class
public class Animal {
        public String name;
        public int age;
        public Animal(String name)
        {
                this.name = name;
        }
        public void callName ()
        {
            System.out.println("call animal name"+ name); 
        }
        
}
