
public class HelloWorldGraphics2_verB {

	public static void main(String args[]) {
		System.out.println("�еe�T����!");
		int count = 9;
		drawTriangle(count);
		System.out.println("�e���٤���!");
	}

	public static void drawTriangle(int count) {
		int i, j;
		for (i = 1; i <= count; i++) {
			if (i % 2 != 0) {
				for (int k = 0; k < (count - i) / 2; k++)
					System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				if (i % 2 == 0)
					continue;
				System.out.print("*");
			}
			System.out.println();
		}
	}

}