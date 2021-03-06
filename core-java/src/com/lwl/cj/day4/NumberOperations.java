package com.lwl.cj.day4;

public class NumberOperations {

	public static void main(String[] args) {

	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num != 0) {
			int r = num % 10;
			sum += r;
			num /= 10;
		}
		return sum;
	}

	public static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		return rev;
	}

	public static boolean isPalindrome(int num) {
		return num == reverse(num);
	}
}
