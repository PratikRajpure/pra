package SpecialProgram;

import java.util.Scanner;

public class EvenOddCheck {
  static void numberCheck(){
		System.out.println("Enter the number to verify even or odd:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
    	if (num % 2 == 0) {
			System.out.println("Enter number " + num + " is even");
		} else {
			System.out.println("Enter number " + num + " is odd");
		}
	}
	public static void main(String[] args) {
		numberCheck();
	}
}