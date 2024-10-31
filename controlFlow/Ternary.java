package controlFlow;
import java.util.Random;
public class Ternary {
    public static void main(String [] args)
    {
        String Game[] = { "sisor", "paper","rock" };
        String user = "rock";
        Random rand = new Random();
        
        for ( int i = 0 ; i<Game.length ; i +=1)
        {

            String gamePlayRandom = Game[rand.nextInt(Game.length)];
            String result = 
            //if
            (user == gamePlayRandom) ? "Matched " + user :
            //else if 
             ((user != gamePlayRandom) ? "False " + gamePlayRandom 
             //else
             :"Matched " +user );           
            System.out.println(result);
        
        }
        
    }
    
}
