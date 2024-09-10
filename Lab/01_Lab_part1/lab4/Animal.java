
public class Animal {
	int age; // 幾歲
	float weight; // 公斤

	Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}

	void speak() {
		System.out.println("年紀 age = " + age + "歲");
		System.out.println("體重 weight = " + weight + "公斤");
	}

	public static void main(String args[]) {
		Animal animal = new Animal(2, 5.0f);
		animal.speak();
	}
}