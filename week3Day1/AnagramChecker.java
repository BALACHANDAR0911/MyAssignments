package week3Day1;

import java.util.Arrays;

public class AnagramChecker {

	public static void main(String[] args) {
		
		String s1 ="stops";
		String s2="potss";
		
		if(s1.length() != s2.length()) {
			System.out.println("Length Mismatach, therefore the strings are not an anagram");
		}
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 
		 if(Arrays.equals(ch1,ch2 )) {
			 System.out.println("The given Strings are anagram");
		 }
		 else {
			 System.out.println("The given Strings are not an anagram");
		 }
		// TODO Auto-generated method stub

	}

}
