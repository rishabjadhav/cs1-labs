//Rishab Jadhav
//Morris 4A
import java.util.*;
public class BMI
{
    public static void main (String[]args)
    {
        Scanner console = new Scanner(System.in);
        
        //1
        System.out.println ("Choose a number");
        int num1 = console.nextInt();
        System.out.println ("Your number plus 10 is " + (num1 + 10));
        
        //2
        System.out.println ("What's your name?");
        String name1 = console.next();
        System.out.println ("Hello, " + name1);
        
        //3
        System.out.print("Enter a number");
        double something = console.nextDouble();
        System.out.println ("Your number squared is " + something*something);
        
        //4
        System.out.println ("Your doorbell is used more by others than yourself.");
        
        //5
        System.out.println ("Enter your name");
        String name2 = console.next();
        System.out.println ("Enter your age here");
        int age = console.nextInt();
        System.out.println(name2 + " is " + age + " years old.");
        
        //6
        System.out.println ("Enter the radius for a hypothetical circle.");
        double radius = console.nextDouble();
        System.out.println ("The area of your hypothetical circle is " + (radius * radius* 3.1415926));
        
        //7
        System.out.println ("How long has your brick been falling?");
        double time = console.nextDouble();
        System.out.println ("Your brick has fell a total of " + (time * 32.174) + "feet");
        
        //8
        System.out.println (name1 + name1 + name1);
        
        //BMI Calculator
        System.out.println ("Enter your height in inches.");
        int height = console.nextInt();
        System.out.println ("Enter your weight.");
        int weight = console.nextInt();
        System.out.println ("Your BMI is " + ((height/39.37) / ((weight/2.205) * (weight/2.205))));
    }
}