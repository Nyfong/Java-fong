package controlFlow;

public class Switch {
    int globalNumber = 10;
    public static void main (String[] args)
    {
       Switch  object = new Switch();
        int option = 1;
        switch(option)
        {
                 case 1 ->{
                 System.out.println(object.globalNumber++); //10
                 System.out.print(object.globalNumber); //11
                    break;
                 }
                 
                default -> {
                    System.out.println("None of above");
                }
        }
    }
}
