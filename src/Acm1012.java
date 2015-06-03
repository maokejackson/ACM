import java.io.IOException;

public class Acm1012
{
   public static final int MIN_N  = 2;
   public static final int MIN_K  = 2;
   public static final int MAX_K  = 10;
   public static final int MAX_NK = 1800;

   public static void main(String[] args) throws IOException
   {
      int n = 0;

      try
      {
         n = ConsoleUtil.readInteger(System.in);
      }
      catch (NumberFormatException e)
      {
         System.err.println("Input must be a number");
         return;
      }

      if (n < MIN_N)
      {
         System.err.println("N must be greater than " + MIN_N);
         return;
      }

      int k = 0;

      try
      {
         k = ConsoleUtil.readInteger(System.in);
      }
      catch (NumberFormatException e)
      {
         System.err.println("Input must be a number");
         return;
      }

      if (k < MIN_K || k > MAX_K)
      {
         System.err.println("K must be greater than " + MIN_K + " and less than " + MAX_K);
         return;
      }

      if (k + n > MAX_NK)
      {
         System.err.println("N + K must be less than " + MAX_NK);
         return;
      }

      int sum = answer(n, k);
      System.out.println(sum);
   }

   private static int answer(int n, int k)
   {
      if (n == 0)
      {
         return 1;
      }
      else if (n == 1)
      {
         return k - 1;
      }
      else
      {
         return (k - 1) * (answer(n - 1, k) + answer(n - 2, k));
      }
   }
}
