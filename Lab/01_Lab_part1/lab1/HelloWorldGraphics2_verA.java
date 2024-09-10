
public class HelloWorldGraphics2_verA {

	public static void main(String args[]) {
		System.out.println("請畫三角形!");
		int count = 9;
		drawTriangle(count);
		System.out.println("畫的還不錯!");
	}

	public static void drawTriangle(int count) {
		int i, j;
		for (i = 1; i <= count; i++) {
			if (i % 2 != 0) {
				for (int k = 0; k < (count - i) / 2; k++)
					System.out.print(" ");
				for (j = 1; j <= i; j++)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}