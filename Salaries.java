//Rishab Jadhav
//Morris 4A
public class Salaries
{
    public static void main (String[]args)
    {
        //1
        String hi = "hi";
        String mom = "Mom";
        System.out.println(hi + ", " + mom);
        
        //2
        String hi2 = "hi";
        String mom2 = "Mom";
        System.out.println(hi2 + ", " + mom2 + "!");
        
        //3
        String someName = "Bob";
        System.out.println("Hello, " + someName + "!");
        
        //4
        String hello = "Hello";
        String world = "World";
        System.out.println(hello + ", " + world + "... Goodbye");
        
        //5
        System.out.println("Nothing");
        
        //6
        int a = 14;
        int b = 6;
        System.out.println(a + " % " + b + " is " + (a % b));
        
        //7
        int minutes = 105;
        System.out.println((minutes / 60) + ":" + (minutes % 60));
        
        //SALARY CALCULATION
        double hourlyRate = 40;
        double hoursWorked = 38;
        double overtimeHours = 3;
        double totalSalary = hourlyRate * hoursWorked;
        
        System.out.println("Your gross weekly salary is " + (totalSalary) + " dollars");
        System.out.println("Including overtime hours worked, your gross weekly salary is ");
        System.out.println((totalSalary + overtimeHours * hourlyRate * 1.5) + " dollars");
        totalSalary = totalSalary + overtimeHours * hourlyRate * 1.5;
        
        double taxRate = (0.25);
        double netSalary = (totalSalary * taxRate); 
        System.out.println("With taxes taken out, your total weekly salary is " + (netSalary));
        
        System.out.println("Hourly rate is " + hourlyRate);
        System.out.println("Hours worked is " + hoursWorked);
        System.out.println("Overtime hours worked is "+ overtimeHours);
        
       
    }   
}