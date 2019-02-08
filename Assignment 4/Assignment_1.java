package homework04;

import java.util.Scanner;

/*
 * Giving a string, find the first non-repeating character in it and return its index.
   If it doesn¡¯t exist, return -1
   For example: ¡°leetcode¡±, return 0
 * */
public class Assignment_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a string:");
		String str = sc.next();
		System.out.println(firstNonRepeatingChar(str));
	}
	
	public static int firstNonRepeatingChar(String str){
		if(str == null || str.length() == 0){
			return -1;
		}
		
		for(int i = 0; i < str.length(); i++){
			boolean hasReapeated = false;
			for(int j = 0; j < str.length(); j++){
				if(i == j){
					continue;
				}
				if(str.charAt(i) == str.charAt(j)){
					hasReapeated = true;
					break;
				}
			}
			if(hasReapeated == false){
				return i;
			}
		}
		return -1;
	}
}
