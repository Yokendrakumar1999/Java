package basic;

public class StringPalindrome {
	
	static boolean isPalindrome(String s) {
		
		
		return false;
		
	}
	
public static void main(String[] args) {
	String s="appa";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
		
	}
	if(s.equals(rev)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println(" Not a Palindrome");
	}
	for(int i=0;i<=s.length();i++) {
		rev=s.charAt(i)+rev;
	}
}
}
