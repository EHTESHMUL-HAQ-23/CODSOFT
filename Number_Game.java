import java.util.Scanner;
import java.util.Random;

public class Number_Game {   

    public static void GuessingNumberGame()  // Function created 
    {
        try (Scanner sc = new Scanner(System.in)) {
            // Generate the numbers
            Random rand=new Random();

            int number = rand.nextInt(100) + 1;


            // Given Trials Chance
            int Ch=6;

            int i, guess;
            System.out.println(" A Number is Chosen" 
                                +" between 1 to 100" 
                                + "Guess the number"
                                +"within 5 trials/chance.");

            // Iterate over ch Trials/chance
            for (i=0;i<Ch;i++)

            {
                System.out.println("Guess the Number :");
                guess=sc.nextInt();
                
                //If the number is guessed
                if (number==guess)
                {
                    System.out.println("you guess correctly");
                    break;
                }
                
                else if (number > guess && i!=Ch -1)
                {
                    System.out.println("The number guess higher than:"+ guess);
                }
                
                else if (number < guess && i!=Ch -1)
                {
                    System.out.println("The number is Lower than :"+ guess);
                }
                
            }
            
            if (i ==Ch)
            {
                System.out.println("You have exhausted " + Ch +" : Chance/Trials");
                
                System.out.println("The number was :" + number);
            }
            
            sc.close();
        }
        
    }

    public static void main(String[] args) 
    {
            GuessingNumberGame();
    }
    
}
