public class vowelCount
{
	/*This function to count number of vowels,consonant,digits and special character in a string.*/
		static void countCharacterType(String str)
	{
		//Declare the variables for number of counts vowels,consonant,didgit and special characters
		byte vowelsCount=0,consonantCount=0,digitCount = 0,spltChars = 0;
		for (short i=0;i<str.lenght();i++)
		{
			char ch = str.charAt(i);
			if((ch>='a'&& ch<='z') || (ch  >= 'A'&&ch<= 'Z'))
			{
				ch = Character.toLowerCase(ch);
				if (ch =='a' || ch =='e'||ch == 'i'||ch == 'u')
						vowelsCount++;
				else
					consonantCount++;
			}
			else if (ch >='0'&&ch <='9)
				digitCount++;
			else
				splChars++/*This counts including white spaces */;
		}
		System.out.println("The total number of vowels in the given string:"+vowelcount);
		System.out.println("The total number of consonants  in the given string:"+consonantcount);
		System.out.println("The total number of digits in the given string:"+digitcount);
        System.out.println("The total number of special character in the given string:"+splchars);
    }
	static public void  main(String[]args)
	{
		String str=("Habit-2:Begin with an end in your mind.\n Stephen R.Convey author of 7 habits of Effective People,
		suggests that effective individuable have a clear vision of their desired destination before embarking on any endeavor.");
		countCharacterType(str)
	}
}
