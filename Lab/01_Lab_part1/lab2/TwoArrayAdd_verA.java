
public class TwoArrayAdd_verA {
	
	public static void main(String[] args) {
		// x°}¦C
		int x[][] = { { 1, 2, 3 }, 
				          { 4, 5, 6 },
				          { 7, 8, 9 } }; 
		// y°}¦C
		int y[][] = { { 10, 11, 12 }, 
	                { 13, 14, 15 },
	                { 16, 17, 18 }}; 
				
		// z°}¦C
		int z[][] = new int[3][3];
		
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];   // °}¦Cz = °}¦Cx +°}¦Cy
				System.out.print(z[i][j] +" ");
			}
			System.out.println();
		}
	}
}
