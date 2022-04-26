package week1.day1;

public class CharOccurance {
public static void main(String[] args) {
	String str = "welcome to chennai";
	int i=0;
	int counter =0;
	
	char[] charArray = str.toCharArray();
	for(i=0;i<charArray.length;i++)
	{
	if(charArray[i]== 'e')
	{
		counter =counter +1;
	
	}
	
	}
	System.out.println(counter);
		
}
	
	
}
