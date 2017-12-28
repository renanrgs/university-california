import java.util.*;
public class Palindrome {

	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		System.out.println(isPalindromeFor(word));
	}

	private static boolean isPalindrome(String word){
		if(word.length() <= 1) return true;
		if(word.charAt(0) != word.charAt(word.length() - 1)) return false;
		return isPalindrome(word.substring(1, word.length() - 1));
	}

	private static boolean isPalindromeFor(String word){
		char[] wordArray = word.toCharArray();
		for(int i = 0, j = wordArray.length - 1; i < wordArray.length; i++, j--){
			if(wordArray[i] != wordArray[j]){
				return false;	
			}
		}

		return true;
	}
}
