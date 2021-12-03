package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
		String rev="";
		int strlength=str.length();
		for (int i=(strlength-1);i>=0; i--) {
			rev=rev+str.charAt(i);
			if (str.equalsIgnoreCase(rev)) {
				System.out.println(str+"is a Palindrome");
			} else {
System.out.println(str+"is not an Palindrome");
			}
			
		}
	}

}
