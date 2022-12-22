//Morris-4A
//Rishab Jadhav
public class BigMacWalk
{
    public static void main(String[]args)
    {
       //1
       int numApples;
       
       //2
       numApples = 12;
       
       //3
       int numOranges = 24;
       
       //4
       System.out.print ("You have ");
       System.out.print (numApples);
       System.out.println (" apples");
      
       System.out.print ("You also have ");
       System.out.print (numOranges);
       System.out.println (" oranges");
       
       //5
       double valPi;
       valPi = 3.14159;
       System.out.print ("Pi is equal to : ");
       System.out.println (valPi);
       
       //6
       System.out.println ("3 sides on a triangle");
       
       //7
       String day;
       day = "Tuesday";
       
       //8
       System.out.print ("Hello! Today is ");
       System.out.println (day);
       
       //9
       int a = 10;
       int b = 20;
       
       //10
       int c = b-a;
       System.out.print ("b minus a equals ");
       System.out.println (c);
       
       //11
       int miles = 192;
       int gallons = 16;
       int MPG = 0;
       
       //12
       MPG = miles/gallons;
       System.out.print ("The MPG is ");
       System.out.println (MPG);
       
       //13
       double length = 12.75;
       double width = 8.65;
       System.out.print ("The area is ");
       System.out.println (length*width);
       
       //14
       System.out.println ("Six players on a paintball team");
       
       //15
       double base = 11.89;
       double height = 22.4;
       double area = base*height*0.5;
       System.out.print ("The area of the triangle is ");
       System.out.println (area);
       
       
       //Big Mac Walk App
       double numBigMacs = 72;
       System.out.print ("The number of calories consumed is ");
       System.out.println (numBigMacs*590);
       double bigMacCals = numBigMacs*590;
       System.out.print ("The distance you would have to walk to burn off all that chow is ");
       double calsPerMile = 94;
       System.out.println (numBigMacs*590/calsPerMile);
       double friesEaten = 36;
       double mcdonaldsSprite = 9; 
       double totalSpriteCals = mcdonaldsSprite*280;
       double totalFriesCals = friesEaten*340;
       double totalCals = bigMacCals+totalSpriteCals+totalFriesCals;
       System.out.print ("The total calorie count is ");
       System.out.print (totalCals);
    }   
}