package week1.day1;

import jdk.internal.joptsimple.internal.Strings;

public class ReverseEvenWords {
public static void main(String args[]) 
{
	
	String test = "I am a software tester";
	
	String[] arrOfStr = test.split(" ",-1);
	String[] Output = new String[5];
	
	int i= 0;
	for(i=0;i<arrOfStr.length;i++)
	{
		String	CurrentString = arrOfStr[i];
		
	if(i%2==0)
	{
	 Output[i]=CurrentString;
	 
		}
	else
	{
		
	String reverse ="";

int j=0;

		for (j=CurrentString.length()-1;j>=0;j--)
		{
			reverse = reverse + CurrentString.charAt(j);
		}
		
		Output[i]=reverse;
		}
	}
	String join = String.join(" ",Output);
	System.out.println(join);
}
}

	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

	

	/* Pseudo Code:
	 
	 * Declare the input as Follow
      		String test = "I am a software tester"; 
	a) split the words and have it in an array
	b) Traverse through each word (using loop)
	c) find the odd index within the loop (use mod operator)
	
	d)split the words and have it in an array
	
	e)print the even position words in reverse order using another loop (nested loop)
	f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
	
	 
*/
	
	

	
	
	
