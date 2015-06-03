

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Vector;

public class ConsoleUtil
{
   public static int readInteger(InputStream stream) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(stream));
      String line = br.readLine();
      String text = line.trim();
      return Integer.parseInt(text);
   }

   public static Vector<Integer> readIntegers()
   {
      Vector<Integer> numbers = new Vector<Integer>();
      // TODO:
      return numbers;
   }
}
