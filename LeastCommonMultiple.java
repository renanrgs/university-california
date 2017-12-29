import java.util.*;
public class LeastCommonMultiple{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		System.out.println(lcm(a, b));
	}

	private static long lcm(long a, long b){
		return (a * b)/gcd(a, b);
	}

	private static long gcd(long a, long b){
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}
