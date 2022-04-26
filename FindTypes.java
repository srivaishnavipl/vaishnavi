package week1.day1;

public class FindTypes {
	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] charArray = test.toCharArray();
		int i =0;
		for(i=0;i<charArray.length;i++)
		{
		if(Character.isDigit(charArray[i]))
		{
		num = num+1;
		}
		else if(Character.isAlphabetic(charArray[i]))
		{
		letter = letter+1;
		}
		else if(charArray[i] == ' ')
		{
		space = space+1;
		}
		else
		{
			specialChar =specialChar+1;
					
		}
		
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}
