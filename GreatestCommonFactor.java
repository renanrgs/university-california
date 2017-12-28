public class GreatestCommonFactor{
	public static void main(String[] args){
		System.out.println(calculate(20, 4));
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
