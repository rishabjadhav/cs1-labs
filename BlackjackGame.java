//Rishab Jadhav
//Morris 4A
import java.util.*;
public class BlackjackGame
 {
   public static void main(String[]args)
   {
     Scanner console = new Scanner(System.in);
     Random rng = new Random();
     boolean bust = false;
     boolean loop = true;
     int sum1 = 0;
     int sum2 = 0;
     while (loop)
     {
       int cardValue = rng.nextInt(10) + 2;
       sum1 = 0;
       System.out.print("You've been dealt " + cardValue);
       sum1+=cardValue;
       cardValue = rng.nextInt(10) + 2;
       sum1+=cardValue;
       System.out.println(" and " + cardValue);
       System.out.println("Your total is " + sum1);
       sum2 = 0;
       cardValue = rng.nextInt(10) + 2;
       sum2+=cardValue;
       cardValue = rng.nextInt(10) + 2;
       sum2+=cardValue;
         if (sum2 >= 21)
       {
         System.out.println("You won since the dealer busted!");
         System.out.println("The dealer's total was " + sum2);
         bust = true;
       }
       if (sum1 >= 21)
       {
          System.out.println("You busted!");
          System.out.println("The dealer's total was " + sum2);
          bust = true;
       }
        while (bust == false)
       {
         System.out.println("1 to Hit // 2 to Stay");
         int dec = console.nextInt();
         if (dec == 1)
         {
           cardValue = rng.nextInt(10) + 2;
           System.out.println("You've been dealt " + cardValue);
           sum1+=cardValue;
           System.out.println("Your total is " + sum1);
           cardValue = rng.nextInt(10) + 2;
           sum2+=cardValue;
           if ((sum1 >= 21) && (sum2 >= 21))
           {
              System.out.println("You and the dealer busted!");
              System.out.println("The dealer's total was " + sum2);
              break;
           }
           if (sum2 >= 21)
           {
              System.out.println("You won since the dealer busted!");
              System.out.println("The dealer's total was " + sum2);
              break;
            }
           if (sum1 >= 21)
           {
              System.out.println("You busted!");
              System.out.println("The dealer's total was " + sum2);
              break;
           }
         }
         if (dec == 2)
         {
           System.out.println("Your total was " + sum1);
           while (sum2 < 15)
           {
              cardValue = rng.nextInt(10) + 2;
              sum2+=cardValue;
           }
           System.out.println("The dealer's total was " + sum2);
           if (sum2 >= 21)
           {
              System.out.println("You won since the dealer busted!");
              System.out.println("The dealer's total was " + sum2);
              break;
           }
           if (sum1 >= 21)
           {
              System.out.println("You busted!");
              System.out.println("The dealer's total was " + sum2);
              break;
           }
           if (sum1 > sum2)
           {
              System.out.println("You won since you got closer to 21!");
              break;
           }
           if (sum1 < sum2)
           {
              System.out.println("You lost since the dealer got closer to 21!");
              break;
            }
           if (sum2 == sum1)
           {
              System.out.println("Draw, you and the dealer got the same number!");
              break;
           }
         }   
       } 
       System.out.println("Want to play again? 1 is Yes // 2 is no.");
       int i = console.nextInt();
       if (i == 1)
       {
           bust = false;
       }
       if (i == 2)
       {
          loop = false;  
        }
     }
   }
}