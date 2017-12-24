import java.util.*;
public class Fibonacci {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int nthNumber = scanner.nextInt();
		System.out.println(get(nthNumber));
		//System.out.println(getSlower(nthNumber));
	}

	private static int get(int nthNumber){
		int[] array = new int[nthNumber];		
		
		if(nthNumber <= 1) return nthNumber;
	
		array[0] = 1;
		array[1] = 1;	

		for(int i = 2; i < array.length; i++){
			array[i] = array[i - 1] + array[i - 2];
		}

		return array[nthNumber - 1];	
	}

	private static int getSlower(int nthNumber){
		if(nthNumber <= 1) return nthNumber;
		return getSlower(nthNumber - 1) + getSlower(nthNumber - 2);
	}
}
