
public class PolyAnimal {
	public static void main(String args[]) {

		
/*	原來的作法
		Animal animal = new Animal(3, 8.0f);
		animal.speak();
		System.out.println("-------------------------------");

		Elephant elephant = new Elephant(8, 1200.0f, "大象");
		elephant.speak();
		System.out.println("-------------------------------");
*/
		
		// 透過多型的作法
		Animal animal[] = new Animal[2];
		animal[0] = new Animal(3, 8.0f);
		animal[1] = new Elephant(8, 1200.0f, "大象");
		for (int i = 0; i < animal.length; i++) {
			animal[i].speak();
			System.out.println("-------------------------------");
		}

	}
}