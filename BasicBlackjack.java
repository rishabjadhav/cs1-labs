//Name: 

//Period:

import java.util.*;

public class BasicBlackjack

{
public static void main(String[] args)

    {
        Scanner console = new Scanner(System.in);
        
        //2
        System.out.println("Insert value for apples");
        int apples =  console.nextInt();
        if (apples >= 0)
        {
            System.out.println("Hello World!");
        }
        
        //3
        System.out.println("Insert value for apples");
        apples = console.nextInt();
        if (apples % 2 == 0)
        {
            System.out.println(" Omg it's even!");
        }
        
        //4
        if (apples % 2 == 1)
        {
            System.out.println( "Hmm that's odd");
        }
        
        //5
        System.out.println("How old are you");
        int votingAge = 18;
        int actualAge = console.nextInt();
        if ( actualAge >= votingAge)
        {
            System.out.println( "You can vote");
        }
        else
        {
            System.out.println("You can't vote");
        }
        //6 
        System.out.println("Enter angle 1");
        int angle1 = console.nextInt();
        System.out.println("Enter angle 2");
        int angle2 = console.nextInt();
        System.out.println("Enter angle 3");
        int angle3 = console.nextInt();
        int totalAngle = angle1 + angle2 + angle3;
        if(totalAngle != 180)
        {
            System.out.println("Error, not equal to 180 degrees");
        }
        else if ((angle1 == angle2) && (angle2 == angle3) && (angle1 == angle3))
        {
            System.out.println ("Equilateral");
        }
        else if ((angle1 == angle2) || (angle2 == angle3) || (angle3 == angle1))
        {
           System.out.println("Isoceles");
        }
        else if ((angle1 != angle2) && (angle2 != angle3) && (angle1 != angle3))
        {
         System.out.println("Scalene");   
        }
        
        //8 
        
      
       System.out.println("Player one; choose 1 for paper, choose 2 for rock, choose 3 for rock");
       int player1 = console.nextInt();
       System.out.println("Player two; choose 1 for paper, choose 2 for rock, choose 3 for rock");
       int player2 = console.nextInt();
       if ((player1 == 1) && (player2 == 1))
       {
           System.out.println("Draw");
       }
       if ((player1 == 2) && (player2 == 2))
       {
           System.out.println("Draw");
       }
       if ((player1 == 3) && (player2 == 3))
       {
           System.out.println("Draw");
       }
       // Paper beats rock
       if ((player1 == 1) && (player2 == 2))
       {
           System.out.println("Paper covers rock, Player 1 wins");
       }
       if ((player1 == 2) && (player2 == 1))
       {
           System.out.println("Paper covers rock, Player 2 wins");
       }
       // Scissors beat paper
       if ((player1 == 1) && (player2 == 3))
       {
           System.out.println("Scissors cut paper, Player 2 wins");
       }
       if ((player1 == 3) && (player2 == 1))
       {
           System.out.println("Scissors cut paper, Player 1 wins");
       }
       // Rock beats Scissors
       if ((player1 == 3) && (player2 == 2))
       {
           System.out.println("Rock beats scissors, Player 2 wins");
       }
       if ((player1 == 2) && (player2 == 3))
       {
           System.out.println("Rock beats scissors, Player 1 wins");
       }
       
       // Basic Blackjack app
       System.out.println("Player one input your hand value");
       int hand1 = console.nextInt();
            System.out.println("Player two input your hand value");
       int hand2 = console.nextInt();
       
       if (hand1 > 21 && hand2 > 21)
       {
           System.out.print("Both Players Bust");
       }
       else if (hand1 > 21)
       {
           System.out.println("Player 2 wins");
       }
       else if (hand2 > 21)
       {
           System.out.println("Player 1 wins");
       }
       if (hand1 > hand2)
       {
           System.out.println("Player 1 wins");
       }
       else if (hand2 > hand1)
       {
           System.out.println("Player 2 wins");
       }
       if (hand1 == hand2)
       {
           System.out.println("Tie");
       }
    }
}   
