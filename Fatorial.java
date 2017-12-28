import java.util.*;
public class Fatorial{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(fatorial(number));
	}

	private static int fatorial(int number){
		if(number == 1) return number;
		return number * (number - 1);
	}
}
