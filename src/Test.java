class Animal {
	public int age;
	public double weight;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void run() {
		System.out.println("跑...");
	}

	public void eat() {
		System.out.println("吃...");
	}

	public Animal() {
		this(0, 0.0);
	}

	public Animal(int age, double weight) {
		this.age = age;
		this.weight = weight;
	}

}

class Cat extends Animal {
	public Cat() {
		super();
	}
	public Cat(int age, double weight) {
		super(age, weight);
	}
	
	public void shout() {
		System.out.println("喵喵叫...");
	}
}
class Tiger extends Cat{
	public Tiger() {
		super();
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger tiger = new Tiger();
		tiger.shout();
	}

}
