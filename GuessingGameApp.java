import java.util.*;

public class GuessingGameApp

{
    public static void main(String[]args)
    {
     Scanner console = new Scanner(System.in);
       
     int guessesLeft  = 10;
     Random rng = new Random();
     int answer = rng.nextInt(1000) + 1;
     boolean won = false;
     while (guessesLeft > 0)
      {
       System.out.println("Guess a number");
       int userInput = console.nextInt();
       if (userInput == answer)
       {
              won = true;
              guessesLeft = 0;
       }
       if (userInput > answer)
       {
               System.out.println("Your guess is too high, try again.");
               guessesLeft--;
               System.out.println("You have " + guessesLeft + " guesses left");
       }
       if (userInput < answer)
        {
               System.out.println("Your guess is too low, try again.");
               guessesLeft--;
               System.out.println("You have " + guessesLeft + " guesses left");
        }
       if (guessesLeft == 0)
       {
          if (won == true)
          {
              System.out.println("Congratulations, you won!");
            }
          else
          {
              System.out.println("Sorry, you ran out of guesses. Game over.");
              System.out.println("The number was " + answer);
           }
        }
      }
    }
  }