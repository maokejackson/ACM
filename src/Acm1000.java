
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Acm1000
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String line = br.readLine();
      String[] split = line.trim().split(" ");

      final Vector<Integer> nums = new Vector<Integer>(split.length);

      for (int i = 0; i < split.length; i++)
      {
         String text = split[i].trim();
         if (!text.isEmpty())
         {
            try
            {
               nums.add(Integer.parseInt(text));
            }
            catch (NumberFormatException e)
            {
               System.err.println("Input must be number");
               return;
            }
         }
      }

      int length = nums.size();

      if (length != 2)
      {
         System.err.println("Must have only 2 numbers");
         return;
      }

      int sum = 0;

      for (Integer integer : nums)
      {
         sum += integer;
      }

      System.out.println(sum);
   }
}
