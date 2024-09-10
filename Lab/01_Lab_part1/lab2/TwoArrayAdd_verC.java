
public class TwoArrayAdd_verC {

	public static void main(String[] args) {
		// x°}¦C
		int x[][] = new int[3][3];
		randomArray(x);
		printArray(x);

		// y°}¦C
		int y[][] = new int[3][3];
		randomArray(y);
		printArray(y);

		// z°}¦C
		int z[][] = new int[3][3];
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j]; // °}¦Cz = °}¦Cx +°}¦Cy
			}
		}
		printArray(z);
	}

	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------");
	}

	public static void randomArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 30);
			}
		}
	}
}
