import java.util.*;

//acmp.ru/index.asp?main=task&id_task=9
public class Sum9 {
	int amountOfNumbers;	
	int [] arr;
	
	public static void main(String[] args) {
		Sum9 sum = new Sum9();
		sum.readFunc();
		System.out.println(sum.minBetweenMaxCounter());
	}
	
	private void readFunc() {
		Scanner sc = new Scanner(System.in);
		amountOfNumbers = sc.nextInt();
		arr = new int [amountOfNumbers];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	private int positionOfMax() {
		int keyMax = 0;
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				keyMax = i;
			}
		}
		return keyMax;
	}
	
	private int positionOfMin() {
		int keyMin = 0;
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				keyMin = i;
			}
		}
		return keyMin;
	}
		
	private int minBetweenMaxCounter() {
		int multiplicationResult = 0;
		int positionOfMin = positionOfMin();
		int positionOfMax = positionOfMax();
		
		if (positionOfMin < positionOfMax) {
			int multiplication = 1;
			for (int i = (positionOfMin+1); i < positionOfMax; i++) {
				multiplication *= arr[i];
			}
			multiplicationResult = multiplication;
		}
		
		if (positionOfMin() > positionOfMax()) {
			int multiplication = 1;
			for (int i = (positionOfMax+1); i < positionOfMin; i++) {
				multiplication *= arr[i];
			}
			multiplicationResult = multiplication;
		}
		return multiplicationResult;
	}
}
