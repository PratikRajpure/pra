package StringPattern;

public class ReverseStringbuilder {

	public static void main(String[] args) {
		String s1 = "ABC";
		
		System.out.println(s1.concat(s1));
		StringBuilder in = new StringBuilder();
		in.append(s1);
		System.out.println(in.reverse());
	}
}