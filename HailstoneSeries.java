import java.util.*;

public class HailstoneSeries

{
    public static void main(String[]args)
    {
     Scanner console = new Scanner(System.in);
     System.out.println("Enter a number between 1 - 1000");
     int n = console.nextInt();
     int turns = 0;
       while (n != 1)
       {
        if ((n % 2) == 0)
        {
          n = (n / 2);
          System.out.println(n);
          turns++;
        }
        else
        {
          n = ((n * 3) + 1);
          System.out.println(n);
          turns++;
        }
     }
     System.out.println("The series completed in " + turns + " tries");
  }
}
