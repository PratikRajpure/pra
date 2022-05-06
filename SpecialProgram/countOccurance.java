package SpecialProgram;

public class countOccurance {
	public static int count(String s, char c) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				result++;
		}
		return result;

	}

	public static void main(String[] args) {
		String s = "abcdeeefgh";
		char c = 'e';
		System.out.println(count(s, c));
	}
}
