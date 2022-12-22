//Rishab and Jordi

//Morris 4A

import java.util.*;

public class BottlesOnTheWallApp


 {
     public static void main(String[] args)
     {
         Scanner console = new Scanner(System.in);
         int age;
         int choice;
         String drink = "";
         int i = 99;
         System.out.println("Enter your age");
         age = console.nextInt();
         if (age < 21)
         {
             while (i > 1)
             {
                 System.out.println(i + " bottles of Coke on the wall");
                 System.out.println(i + " bottles of Coke");
                 System.out.print("Take one down, pass it around, " + (i - 1));
                 System.out.println(" bottles of Coke on the wall");
                 System.out.println("");
                 System.out.println("");
                 i--;
                }
             while (i == 1)
             {
                 System.out.println(i + " bottles of Coke on the wall");
                 System.out.println(i + " bottles of Coke");
                 System.out.print("Take one down, pass it around, zero more");
                 System.out.println(" bottles of Coke on the wall");
                 System.out.println("");
                 System.out.println("");
                 i--;
                }
            }
         else
         {
            System.out.println("Would you like beer (1) or Coke (2)?");
            int c = console.nextInt();
            while ((i > 1) && (c == 1))
             {
                 System.out.println(i + " bottles of beer on the wall");
                 System.out.println(i + " bottles of beer");
                 System.out.print("Take one down, pass it around, " + (i - 1));
                 System.out.println(" bottles of beer on the wall");
                 System.out.println("");
                 System.out.println("");
                 i--;
                }
            while ((i == 1) && (c == 1))
             {
                 System.out.println(i + " bottles of beer on the wall");
                 System.out.println(i + " bottles of beer");
                 System.out.print("Take one down, pass it around, zero more");
                 System.out.println(" bottles of beer on the wall");
                 System.out.println("");
                 System.out.println("");
                 i--;
                }
                
            while ((i > 1) && (c == 2))
             {
                 System.out.println(i + " bottles of Coke on the wall");
                 System.out.println(i + " bottles of Coke");
                 System.out.print("Take one down, pass it around, " + (i - 1));
                 System.out.println(" bottles of Coke on the wall");
                 System.out.println("");
                 System.out.println("");
                 i--;
                }
            while ((i == 1) && (c == 2))
             {
                 System.out.println(i + " bottles of Coke on the wall");
                 System.out.println(i + " bottles of Coke");
                 System.out.print("Take one down, pass it around, zero more");
                 System.out.println(" bottles of Coke on the wall");
                 System.out.println("");
                 System.out.println("");
                 i--;
                }
            }
        }
    }