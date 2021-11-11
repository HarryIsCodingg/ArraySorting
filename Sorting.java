
public class Sorting {
	public static void main(String[] args) {

		int[] number = { 11, 20, 60, 2, 1, 6 };

		for (int i = 0; i < number.length; i++) {
			int largest = number[i];
			int index = i;
			for (int j = i + 1; j < number.length; j++) {
				if (largest < number[j]) {
					largest = number[j];
					index = j;
				}

			}
			number[index] = number[i];
			number[i] = largest;

		}
		for(int x:number) {
			System.out.println(x);
		}
	}

}
