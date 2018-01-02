import java.util.*;
public class GreatestCommonFactor{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(calculate(a, b));
	}

	/**
		Euclidean solution
	**/
	private static int calculate(int a, int b){
		if(b == 0) return a;
		return calculate(b, a % b);
	}	
}
/*

*/
