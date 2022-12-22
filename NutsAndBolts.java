//Rishab and Sebastian
//Morris 4A
import java.util.*;
public class NutsAndBolts
{
    public static void main (String[]args)
    {
        Scanner console = new Scanner(System.in);
        /*
        //1
        System.out.println("Enter a number value");
        double num1 = console.nextDouble();
        System.out.println("Enter another number value");
        double num2 = console.nextDouble();
        if (num1 > num2)
        {
         System.out.println(num1);   
        }
        if (num2 > num1)
        {
         System.out.println(num2);   
        }
        if (num1 == num2)
        {
         System.out.println("Same");   
        }
        
        //2
        System.out.println("Enter the bill");
        double totalBill = console.nextDouble();
        double discountVar = 0;
        if (totalBill > 2000)
        {
          discountVar = totalBill * 0.85;
        }
        
        else if (totalBill > 1000)
          {
              discountVar = totalBill * 0.9;
            } 
        if (totalBill < 1000)
        {
            discountVar = totalBill;
        }
        System.out.println("The total bill is " + discountVar);
        
        //3
        System.out.println("Enter the bill");
        double totalBill2 = console.nextDouble();
        System.out.println("You have a coupon. Enter true or false.");
        boolean hasCoupon = console.nextBoolean();
        double discountVar2 = 0;
        if (totalBill2 > 2000)
        {
          discountVar2 = totalBill2 * 0.85;
        }
        
        else if (totalBill2 > 1000)
          {
              discountVar2 = totalBill2 * 0.9;
            } 
        if (totalBill2 < 1000)
        {
            discountVar2 = totalBill2;
        }
        if (hasCoupon == true)
        {
            discountVar2 = discountVar2 * 0.95;
        }
        System.out.println("The total bill is " + discountVar);
        
        //4
        System.out.println("A cold");
        
        //5
        System.out.println("What year is it?");
        int year = console.nextInt();
        int div = (year % 4);
        if (div == 0)
        {
            System.out.println("It is a leap year.");
            
        }
        else
            {
             System.out.println("It is not a leap year");   
            }
          */  
        //Nuts and Bolts Lab
        System.out.println("Enter bolts");
        int bolts = console.nextInt();
        System.out.println("Enter nuts");
        int nuts = console.nextInt();
        System.out.println("Enter washers");
        int washers = console.nextInt();
        boolean criteriaMet = ((bolts == nuts) && (washers == bolts * 2));
        if ((criteriaMet == true))
        {
           System.out.println("Bolts : " + bolts);
            System.out.println("Nuts : " + nuts);
            System.out.println("Washers : " + washers);
            System.out.println("Cost : " + ((bolts * 0.05)+(nuts * 0.03)+(washers * 0.01)));
        }
        else 
        {
            System.out.println("Error");
        }
  
        
    }     
        }