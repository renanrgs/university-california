import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(getChange(n));
	}

	public static int getChange(int n) {
		int array[] = new int[] { 10, 5, 1 };
		int result = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				++result;
				n %= array[i];
			}
			if (n < array[i])
				continue;
			result += n / array[i];
			n %= array[i];
		}

		return result;
	}

}

