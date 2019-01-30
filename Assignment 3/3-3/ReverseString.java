package homework0303;

import java.util.Scanner;

/*
Given an input string, reverse the string word by word. Example: Input: ¡°The sky is
blue¡±, output: ¡°blue is sky the¡±.
1. A word is defined as a sequence of non-space characters.
2. Input string may contain leading or trailing spaces. However, your reversed string
should not contain leading or trailing spaces.
3.You need to reduce multiple spaces between two words to a single space in the reversed string.
*/
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a sentence:");
	    String s = sc.nextLine();
	    System.out.println("the reversed sentence is:");
	    System.out.println(reverseString(s));
	    
	}
	
	public static String reverseString(String s){
		String ans = null;
		String[] arr = s.split(" ");
		
		for(int i = arr.length-1; i >= 0; i--){
			if(!arr[i].isEmpty()){
				if(ans == null){
					ans = arr[i];
				}else{
					ans = ans + " " + arr[i];
				}
			}
		}
		return ans;
	}
}
