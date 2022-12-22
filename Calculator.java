//Name: 

//Period:

import java.util.*;

public class Calculator
{
    public static void main (String[]args)
    {
        Scanner console = new Scanner(System.in);
        
        //1
        System.out.println("Enter 'a' value.");
        int a = console.nextInt();
        if (a == 9)
        {
            System.out.println("#1");
        }
        
        //2
        System.out.println("Enter 'b' value.");
        int b = console.nextInt();
         if ((b == 9) || (b >= 20))
        {
            System.out.println("#2");
        }
        
        
        //3
        System.out.println("Enter 'c' value.");
        int c = console.nextInt();
         if ((a == 5) || (a == 6))
        {
            System.out.println("#3");
        }
        
        
        //4
        System.out.println("9 Lives of a Cat");
        
        //5
        System.out.println("Enter 'd' value.");
        int d = console.nextInt();
         if ((d <= 3) || (d >= 5))
        {
            System.out.println("#5");
        }
        
        //6
        System.out.println("Enter 'e' value.");
        int e = console.nextInt();
         if ((e <= 3) || (e >= 5))
        {
            System.out.println("#6");
        }

        //7
        System.out.println("Enter 'f' value.");
        int f = console.nextInt();
         if ((f <= 23) || (f >= 18))
        {
            System.out.println("#7");
        }

        //8
        System.out.println("You have 15 points to allocate, don't overuse");
        System.out.println("Enter strength points");
        int strengthPoints = console.nextInt();
        System.out.println("Enter health points");
        int healthPoints = console.nextInt();
        System.out.println("Enter magic points");
        int magicPoints = console.nextInt();
        int totalPoints = magicPoints + strengthPoints + healthPoints;
        
        if (totalPoints >= 15)
        {
           strengthPoints = 5;
           healthPoints = 5;
           magicPoints = 5;
           System.out.println("Your points have been reset to 5");
           System.out.println("Follow directions next time");
        }
        
        //9
        System.out.println("A match");
        
        //Calculator
        System.out.println("Choose your first integer");
        int numOne = console.nextInt();
        System.out.println("Choose your second integer");
        int numTwo = console.nextInt();
        System.out.println("Choose an operation");
        System.out.println("Type '1' for addition (+)");
        System.out.println("Type '2' for subtraction (-)");
        System.out.println("Type '3' for multiplication (*)");
        System.out.println("Type '4' for division (/)");
        int oper = console.nextInt();
        
        if (oper == 1)
        {
            System.out.println(numOne + numTwo);
        }
        
        if (oper == 2)
        {
            System.out.println(numOne - numTwo);
        }
        
        if (oper == 3)
        {
            System.out.println(numOne * numTwo);
        }
        
        if (oper == 4)
        {
            System.out.println(numOne / numTwo);
        }
        
    }
}