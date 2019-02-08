package homework04;

import java.util.Scanner;

/*
 * Given a string s, find the longest palindromic substring in s.
   You may assume that the maximum length of s is 1000.
   For example, input: ¡°babad¡±, return ¡°bab¡±, ¡°aba¡± is also a valid answer, you only need to find one.
 * */
public class Assignment_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a string:");
		String s = sc.next();
		System.out.println(findLongestPalindromic(s));
	}

	public static String findLongestPalindromic(String s){
		if(s.length() <= 1){
			return s;
		}
		for(int right = s.length(); right > 0; right--){
			for(int left = 0; left <= s.length()-right; left++){
				String sub = s.substring(left, left+right);
				int count = 0;
				for (int i = 0; i < sub.length() / 2; i++) {
					if (sub.charAt(i) == sub.charAt(sub.length() - i - 1)){
						count++;
					}
				    if (count == sub.length() / 2){
				    	return sub;
					}
		        }
			}
		}
		return "";
	}
}
