package controlFlow;
import java.util.Random;
public class Ternary {
    public static void main(String [] args)
    {
        String Game[] = { "sisor", "paper","rock" };
        String user = "rock";
        Random rand = new Random();
        
            String gamePlayRandom = Game[rand.nextInt(Game.length)];
            String result = 
            //if
            (user == gamePlayRandom) ? user :
            //else if 
             ((user != gamePlayRandom) ? gamePlayRandom 
             //else
             : "default");           
            System.out.println(result);
        
        
    }
    
}
