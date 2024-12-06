import java.util.Scanner;
import java.util.Random;
public class Simple_guessnumber 

{
public static void main(String[] args) 
    {

        int  answer,guess;
        final int max=5;
        
        Scanner keyboard= new Scanner(System.in);
        Random rand=new Random();

        answer=rand.nextInt(max) + 1;

        System.out.println("Guess a number between 1 and 5 :");
        guess =keyboard.nextInt();

        if (guess == answer)
        {
            System.out.println("Congraulation ! , Good you get it.");
        }

        else
        {
            System.out.println("Sorry , You not guess it. "
            +"The number was: " + answer );
        }

        keyboard.close();

    }
}
