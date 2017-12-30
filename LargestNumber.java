import java.util.*;
public class LargestNumber{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		System.out.println(getLargest(n));
	}

	private static String getLargest(String number){
		int largest = 0;
		StringBuilder s = new StringBuilder(number.length());
		for(int i = 0; i < number.length(); i++){
			s.append(i);
			if(number.charAt(i) > number.charAt(largest)){
				largest = i;
				s.insert(0, number.charAt(largest));
				s.deleteCharAt(i + 1);
			}
		}
		return s.toString();
	}
}
