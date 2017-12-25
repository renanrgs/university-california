import java.util.*;
public class HighestProductOfThreeNumbers {
	public static void main(String... args){
		Scanner scanner = new Scanner(System.in);	
		int length = scanner.nextInt();
		int[] array = new int[length];
		for(int i = 0;  i < length; i++){
			array[i] = scanner.nextInt();
		}
		System.out.println(getHighestProduct(array));
	}

	private static int getHighestProduct(int[] input){
		int highestIndex = -1;
		int lowestNegativeIndex = -1;	
		for(int i = 0; i < input.length; i++){
			if(highestIndex == -1 || input[highestIndex] < input[i]){
				highestIndex = i;		
			}
			if(lowestNegativeIndex == -1 ||  input[lowestNegativeIndex] > input[i]){
				lowestNegativeIndex = i;
			}
		}
		int lowestNegativeIndex2 = -1; 
		int highestIndex2 = -1;
		for(int i = 0; i < input.length; i++){
			if(i == highestIndex){
				continue;
			}
			if(highestIndex2 == -1 || input[highestIndex2] < input[i]) {
				highestIndex2 = i;	
			}
		}
		for(int i = 0; i < input.length; i++){
			if(i == lowestNegativeIndex){
				continue;
			}

			if(lowestNegativeIndex2 == -1 || input[lowestNegativeIndex2] > input[i] ){
				lowestNegativeIndex2 = i;
			}
		}
		int highestProductTwoNumbers = input[highestIndex] * input[highestIndex2];
		if(highestProductTwoNumbers < (input[lowestNegativeIndex] * input[lowestNegativeIndex2])){
			highestProductTwoNumbers = input[lowestNegativeIndex] * input[lowestNegativeIndex2];
		}
		int highestProduct = highestProductTwoNumbers; 		
		for(int i = 0; i < input.length; i++) {
			if(highestProduct < highestProductTwoNumbers * input[i]) {
				System.out.println(input[i]);
				highestProduct = highestProductTwoNumbers * input[i]; 
			}	
		}
		return highestProduct;
	}
}
