//Morris 4A
//Rishab Jadhav
public class CreditCard
{
    public static void main (String[]args)
    {
        //1
        double tuna = 2.99;
        System.out.println (tuna + 3);
        
        //2
        tuna++;
        
        //3
        tuna = tuna + 5;
        
        //5
        tuna = tuna/10;
        System.out.println (tuna);
        
        //6
        int a = 4;
        int b = 6;
        //My guess is 12
        System.out.print("The answer is ");
        System.out.println(2*a+3*b*(a+b)/2);
        
        //7
        int c = 5;
        int d = 9;
        //My guess is -12
        System.out.print("The answer is ");
        System.out.println(-1*(c+d)*(c+d)/4);
        
        //8
        System.out.print ("She's too short to reach the elevator buttons");
        System.out.println (" above 20 so on rainy days she uses an umbrella");
        
        //9
        double pi = 3.1415926;
        double radius = 6.5;
        System.out.print ("The area of the circle is ");
        System.out.println (pi*radius*radius);
        
        //10
        double something = 4.5;
        System.out.println (something);
        
        //11
        int sideA = 4;
        int sideB = 9;
        System.out.println (sideA*sideA + sideB*sideB);
        
        //12
        System.out.println (sideA % sideB);
        
        //CREDIT CARD PAYMENT APP
        double totalDebt;
        double minMonthlyPayment;
        
        totalDebt = 3200.00;
        System.out.print ("Your debt is ");
        System.out.println (totalDebt);
        
        System.out.print ("Your monthly due is ");
        System.out.println (totalDebt*0.05);
        
        int months = 6;
        System.out.print ("For payment over a ");
        System.out.print (months);
        System.out.print (" month period, you would pay ");
        System.out.print (months*totalDebt);
        
    }    
}