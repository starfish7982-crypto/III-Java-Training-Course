
public class PolyAnimal {
	public static void main(String args[]) {

		
/*	��Ӫ��@�k
		Animal animal = new Animal(3, 8.0f);
		animal.speak();
		System.out.println("-------------------------------");

		Elephant elephant = new Elephant(8, 1200.0f, "�j�H");
		elephant.speak();
		System.out.println("-------------------------------");
*/
		
		// �z�L�h�����@�k
		Animal animal[] = new Animal[2];
		animal[0] = new Animal(3, 8.0f);
		animal[1] = new Elephant(8, 1200.0f, "�j�H");
		for (int i = 0; i < animal.length; i++) {
			animal[i].speak();
			System.out.println("-------------------------------");
		}

	}
}