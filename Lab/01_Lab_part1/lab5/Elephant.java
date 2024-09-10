
public class Elephant extends Animal {

	String name; // 種類名稱

	Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}

	void speak() {
		super.speak();
		System.out.println("種類名稱 name = " + name);
	}

	public static void main(String args[]) {
		Animal animal = new Animal(3, 8.0f);
		animal.speak();

		System.out.println("-------------------------------");

		Elephant elephant = new Elephant(8, 1200.0f, "大象");
		elephant.speak();
	}
}