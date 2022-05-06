package SpecialProgram;


import java.util.Scanner;

public class EvenAndOdd {
	 static void evenAndOddSeries(){
		System.out.println("Enter the length of series:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Even Number:");
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {

				System.out.print(i + ",");
			}
		}

		System.out.println("\nodd number");
		for (int j = 0; j < num; j++) {

			if (j % 2 != 0) {
				System.out.print(j + ",");
			}
		}
	}
	 public static void main(String[] args) {
		evenAndOddSeries();
	}
}
