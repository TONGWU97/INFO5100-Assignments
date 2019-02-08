package homework04;

import java.util.Scanner;

/*
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
   For example: 38, return 2.
   Explanation: 3 + 8 = 11 ¡ú 1 + 1 = 2
 * */
public class Assignment_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a non-negative integer number:");
		int i = sc.nextInt();
		System.out.println(addDigits(i));
	}
	
	public static int addDigits(int num){
		if(num < 10){
			return num;
		}
		int ans = 0;
		while(num != 0){
			ans += num % 10;
			num /= 10;
		}
		return addDigits(ans);
	}
}
