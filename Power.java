import java.util.*;
public class Power{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int potency = scanner.nextInt();	
		System.out.println(power(number, potency));
		
	}

	private static int power(int number, int p){
		if(p == 0) return 1;
		return number * power(number, p - 1);
	}
}
