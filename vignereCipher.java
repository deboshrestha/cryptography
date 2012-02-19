//this is just the encryption part, yet to work on decryption as well as files
import java.io.*;

class vignereCipher
{
	public static void main(String [] args)
	{
		int rowMax = 26;
		int colMax = 26;
		
		int vignereT[][] = new int[26][26];
		
		for(int rows = 0; rows < rowMax ; rows++)
		{
			for(int cols = 0; cols < colMax; cols++)
			{
				vignereT[rows][cols] = (rows + cols) % 26;
			}
		}
		
		SimpleIO.prompt("Enter the plain text  ");
		String pText = SimpleIO.readLine();
		SimpleIO.prompt("Enter the key text  ");
		String kText = SimpleIO.readLine();
		
		pText = pText.toUpperCase();
		kText = kText.toUpperCase();
		
		String cipherText = "";
		
		int kIndex = 0;
		
		for(int pIndex = 0; pIndex < pText.length() ; pIndex ++)
		{
			char pchar = pText.charAt(pIndex);
			int asciival = (int)pchar;
			if(pchar == ' ')
			{
				cipherText += pchar;
				continue;
			}
			if(asciival < 65 || asciival > 90)
			{
				cipherText += pchar;
				continue;
			}
			
			int pTextVal = ((int)pchar) - 65;
			
			char kchar = kText.charAt(kIndex);
			int kTextVal = ((int)kchar) - 65;
			
			int tEntry = vignereT[pTextVal][kTextVal];
			char cChar = (char)(tEntry + 65);
			cipherText += cChar;
			
			kIndex++;
			if(kIndex == kText.length())
				kIndex = 0;
		}
		
		SimpleIO.prompt("The encrypted text is : " + cipherText);
	}
}	
		
		
		
		
	