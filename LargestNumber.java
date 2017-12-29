import java.util.*;
public class LargestNumber{
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] n = new int[length];
		for(int i = 0; i < length; i++){
			n[i] = scanner.nextInt();
		}
		System.out.println(getLargest(n));
	}

	private static int getLargest(int[] n){
		int largestInd = 0;	
		for(int i = 0; i < n.length; i++){
			if(n[i] > n[largestInd])
				largestInd = i;
		}

		return n[largestInd];
	}
}
