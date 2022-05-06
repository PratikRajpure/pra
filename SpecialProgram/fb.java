package SpecialProgram;

import java.util.Scanner;

public class fb {
private static void checkfibonaccis() {
	System.out.println("enter the value of count:");
	Scanner sc = new Scanner(System.in);
	int count = sc.nextInt();
	// TODO Auto-generated method stub
	int n1 = 0, n2 = 1, n3;
	System.out.print(n1+","+n2  );
	for (int i = n2; i <= count; i++) {
		n3 = n1 + n2;
		System.out.print("," + n3);
		n1 = n2;
		n2 = n3;
	}
}
	public static void main(String[] args) {
		checkfibonaccis();
}

}