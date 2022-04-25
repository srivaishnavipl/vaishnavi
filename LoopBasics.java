package week1.day1;

public class LoopBasics {
public static void main(String[] args) {
	int x[]= {1,2,3,4,5,6,7,8,9,10};
	int i = 0;
	for (i=0;i<10;i++)
	{
	System.out.println(x[i]);
}
for (i=0;i<10;i++)
	{
	if(x[i]%2!=0)
	System.out.println(x[i]);
	}
	for (i=9;i>=0;i--)
	{
		System.out.println(x[i]);
	}
	String names = ("madam");
	
	for (i=0;i<names.length();i++)
	{
		System.out.println(names.charAt(i));
	}
	
	String reverse ="";
	for (i= names.length()-1;i>=0;i--)
	{
		reverse = reverse + names.charAt(i);
		
	}
	boolean equals = names.equals(reverse);
	if(equals==true)
	{
	System.out.println("palindrome");
	}
	else
	{
	System.out.println("Not Palindrome");	
	}
	}
	
}
