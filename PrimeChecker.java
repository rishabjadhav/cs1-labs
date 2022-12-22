import java.util.*;
public class PrimeChecker
{
    public static void main(String[]args)
  {
    Scanner console = new Scanner(System.in);
    boolean run = true;
    int i = 1;
    System.out.print("Enter an integer: ");
    int integer = console.nextInt();
    while(run)
    {
      i++;
       if (i == integer)
      {
          System.out.println(integer + " is prime");
          break;
      } 
      if (integer % i == 0)
      {
          System.out.println(integer + " is not prime");
          break;
      }
    }
  }
}