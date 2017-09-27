import java.util.*;

//acmp.ru/index.asp?main=task&id_task=65
public class Sum65 {
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введіть головний рядок");
		String s1 = sc.nextLine(); 
		char [] arr = s1.toCharArray();
		int [] arrInt = new int [arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arrInt[i] = ((int)arr[i])-48;
		}
//		System.out.println(Arrays.toString(arrInt));
		
		System.out.println("Введіть кількість рядків");
		int linesNumber = sc.nextInt();
		int [] arrCount = new int [linesNumber];
		
		for (int j = 0; j < linesNumber; j++) {
			System.out.println("Введіть рядок №" + (j+1));
			int coincidence = 0;
			
			Scanner scan = new Scanner(System.in);
			String strCh = scan.nextLine();
			char [] arrCh = strCh.toCharArray();
			int [] intLine = new int [arr.length];
				
				for (int i = 0; i < arr.length; i++) {
					intLine[i] = ((int)arrCh[i])-48;
				}
				
				for (int k = 0; k < intLine.length; k++) {
					if (!(intLine[k] == arrInt[k])) {
						coincidence++;
					}
				}
				arrCount[j] = coincidence;
		}
		
				int min = arrCount[0];
				for (int i = 1; i < arrCount.length; i++) {
					if (min > arrCount[i] ) {
						min = arrCount[i];
					}
				}

				ArrayList<Integer> numbersOfSmallestAmount = new ArrayList<Integer>();
				for (int i = 0; i < arrCount.length; i++) {
					if (min == arrCount[i]) {
						numbersOfSmallestAmount.add((i+1));				
					}
				}
				
		System.out.println(Arrays.toString(arrCount));
		System.out.println(min);
		System.out.println(numbersOfSmallestAmount.toString());
	}
}
