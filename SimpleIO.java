
import java.io.*;

public class SimpleIO
{
	private static InputStreamReader streamfn = new InputStreamReader(System.in);
	private static BufferedReader br = new BufferedReader(streamfn);
	
	public static void prompt(String s)
	{
		System.out.println(s);
	}
	
	public static String readLine()
	{
		String line = null;
		try
		{
			line = br.readLine();
		}
		catch(IOException e)
		{
			System.out.println("Error : " + e.getMessage());
			System.exit(-1);
		}
		return line;
	}
}
	