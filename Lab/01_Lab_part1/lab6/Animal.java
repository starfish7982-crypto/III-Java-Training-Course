
public class Animal {
	int age; // �X��
	float weight; // ����

	Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}

	void speak() {
		System.out.println("�~�� age = " + age + "��");
		System.out.println("�魫 weight = " + weight + "����");
	}

	public static void main(String args[]) {
		Animal a = new Animal(2, 5.0f);
		a.speak();
	}
}