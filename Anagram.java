package week1.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1="stops";
		String text2 = "potss";
		   
		int i = text1.length();
		int j = text2.length();
System.out.println(i==j);
	
 char[] text1Array = text1.toCharArray();
 char[] text2Array = text2.toCharArray();
 Arrays.sort(text1Array);
 Arrays.sort(text2Array);
 
 String sortedText1 = new String(text1Array);
 String sortedText2 = new String(text2Array);
 System.out.println(sortedText1);
 System.out.println(sortedText2);
 
 if(sortedText1.equals(sortedText2))
 {
	 System.out.println("string are equal");
 }
 else
 {
	 System.out.println("string are not equal");
 }
	 }
	 

		
		
	}
		
	
	/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */
