package StringPattern;
public class ReverseStringArray{
	public static void main(String[] args) {
	reverseString();
	}

	 static void reverseString() {
     String s1= "ABC";

     
     char[] c=s1.toCharArray();
     for (int i = c.length-1; i>=0; i--) {
		System.out.print(c[i]);
	}
	}
}