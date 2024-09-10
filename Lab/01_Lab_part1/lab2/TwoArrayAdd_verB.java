
public class TwoArrayAdd_verB {
	
	public static void main(String[] args) {
		// x°}¦C
		int x[][] = { { 1, 2, 3 }, 
				          { 4, 5, 6 },
				          { 7, 8, 9 }}; 
		printArray(x);
		
		// y°}¦C
		int y[][] = { { 10, 11, 12 }, 
	                { 13, 14, 15 },
	                { 16, 17, 18 }}; 
		printArray(y);
		
		// z°}¦C
		int z[][] = new int[3][3];
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];   // °}¦Cz = °}¦Cx +°}¦Cy
			}
		}
		printArray(z);
	}
		
	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("---------");
	}
}
