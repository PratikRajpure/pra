package StringPattern;


public class TotalStringNumber {
public static void main(String[] args) {
	String s= "The java is object oriented language";
	int count=0;
for (int i = 0; i <s.length(); i++) {

	if(s.charAt(i)!=' ')
		count++;
}		System.out.println("The String number count="+count);
}
}