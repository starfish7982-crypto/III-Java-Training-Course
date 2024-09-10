
public class HelloWorldGraphics3 {

	public static void main(String args[]) {

		try {
			int count = Integer.parseInt(args[0]);
			if (count > 0) {
				System.out.println("�еe�T����!");
				drawTriangle(count);
				System.out.println("�e���٤���!");
			} else
				System.out.println("3-�Фſ�J�t�Ʃ�0!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("1-�п�J���!");
		} catch (NumberFormatException e) {
			System.out.println("2-�п�J���!");
		}

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