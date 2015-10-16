
public class Zoo 
{
	public static void main(String[] args) 
	{ 
		Zoo.printVowels("elephant");
		Zoo.printConsonants("crocodile");
		Zoo.printDigits("b8dk093jk21?");
		Zoo.processExpress("5 + 5 = 10"); 
	}
	static boolean isVowel(char c) //what's a vowel? Definition of a vowel
	{
		String vowels = "AEIOUaeiou";
		return vowels.indexOf(c) != -1; 
		//if(c == 'A' || c == 'a') 
		//{
		//return true; 
		//}
		//else if(c == 'E' || c == 'e')
		//{
		//return true;
		//}
		//else if(c == 'I' || c == 'i')
		//{
		//return true;
		//}
		//else if(c == 'O' || c == 'o')
		//{
		//return true;
		//}
		//else if(c == 'U' || c == 'u')
		//{
		//return true; 
		//}
		//else 
		//{
		//return false;
		//}
	}
	static void printVowels(String printVowels) //check to see if it's a vowel
	{
			for(int i = 0; i < printVowels.length(); i++)
			{
				if(Zoo.isVowel(printVowels.charAt(i)) == true) //if it's a vowel
				{
					System.out.println(printVowels.charAt(i)); //print it out
				}
			}
	}
	
	static boolean isCons(char c) //what's a consonant? Definition of a consonant 
	{
		String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		return consonants.indexOf(c) != -1;
	}
	
	static void printConsonants(String printConsonants) //check to see if it's a consonant 
	{
		for(int i = 0; i < printConsonants.length(); i++) //going through everything in a String
		{
			if(Zoo.isCons(printConsonants.charAt(i)) == true) //if it's a consonant 
			{
				System.out.println(printConsonants.charAt(i)); //print it out
			}
		}
	}
	static void printDigits(String printDigits) //what is a digit? Definition of a Digit
	{
		for(int i = 0; i < printDigits.length(); i++) //going through everything in a String given
		{
			if("0123456789".indexOf(printDigits.charAt(i)) != -1) //if it's a Digit
			{
				System.out.println(printDigits.charAt(i)); //print it out
			}
		}
	}
	static int processExpress(String processExpress)
	{
		String currNumber = ""; //empty string to build up number
		for(int i = 0; i < processExpress.length(); i++)
		{
			//System.out.println(processExpress.charAt(i)); //processes string one digit symbol at a time
			if("0123456789".indexOf(processExpress.charAt(i)) != -1) //if the current number that we are looking at is a digit
			{
				currNumber = currNumber + processExpress.charAt(i); //concatenate 
			}
			else //if it's not a digit
			{
				System.out.println(currNumber); //print it out
				currNumber = ""; //separates the two numbers 
			}
		}
		System.out.println(currNumber);
		return -1; //makes happy because we're returning an "int"
	}
	static int charToInt(char charToInt) //convert a char into an "int" or real digit
	{
		String theDigits = "0123456789";
		return theDigits.indexOf(charToInt); //51:10
	}
}