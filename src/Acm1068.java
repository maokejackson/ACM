
import java.io.IOException;

public class Acm1068
{
   public static final int MAX = 10000;

   public static void main(String[] args) throws IOException
   {
      int number = 0;

      try
      {
         number = ConsoleUtil.readInteger(System.in);
      }
      catch (NumberFormatException e)
      {
         System.err.println("Input must be a number");
         return;
      }

      if (Math.abs(number) > MAX)
      {
         System.err.println("Input must be not greater than " + MAX + " by it's absolute value.");
         return;
      }

      boolean isPositive = number > 0;
      int start = isPositive ? 1 : number;
      int end = isPositive ? number : 1;
      int size = end - start + 1;
      int sum = (start + end) * size / 2;

      System.out.println(sum);
   }
}
