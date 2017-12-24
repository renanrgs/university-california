import java.util.*;
public class Palindrome {

	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		System.out.println(isPalindrome(word));
	}

	private static boolean isPalindrome(String word){
		if(word.length() <= 1) return true;
		if(word.charAt(0) != word.charAt(word.length() - 1)) return false;
		return isPalindrome(word.substring(1, word.length() - 1));
	}
}
/*
	ana	
*/
