import java.util.*;

public class Sum5 {
	
	int [] numbers = readFunc();
	
	public static void main(String[] args) {
		new Sum5().calculator();
	}
	
	public void calculator() {
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if ((numbers[i]%2) == 1) {
				System.out.print(numbers[i] + " ");
				odd++;
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < numbers.length; i++) {
			if ((numbers[i]%2) != 1) {
				System.out.print(numbers[i] + " ");
				even++;
			}
		}
		
		System.out.println();
		
		if (odd < even) {
			System.out.println("YES");
		} else System.out.println("NO");
	}
	
	public int[] readFunc() {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int [] arr  = new int [amount];
		
		for (int i = 0; i < amount; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
}
}
