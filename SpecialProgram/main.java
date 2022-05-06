package SpecialProgram;

import java.util.Scanner;

public class main {
	 int c;

	public static void main(String[] args) {
		main m= new main();
		
		m.c = 0;
		System.out.print("Enter N : ");
		int n = (new Scanner(System.in)).nextInt();
		for (int i = 0; i < n; i++)
			print(1, n, i, "");
		System.out.println("The count is : " + m.c);
	}

	private static void print(int s, int n, int x, String p) {
		main m= new main();
		if (x == 0)
			for (int i = s; i <= n; i++) {
				System.out.println(p + i);
				m.c++;
			}
		else
			for (int i = s; i <= n - x; i++)
				print(i + 1, n, x - 1, p + i + " ");
	}
}