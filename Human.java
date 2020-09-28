package week13;

public class Human {
	
	void work() {
		System.out.println("Human can work");
	}
	
}
class Engineer extends Human{
	void eat() {
		System.out.println("Human can eat");
	}
}
class Student extends Engineer{
	public static void main(String[]args) {
		Student std1 = new Student();
		std1.work();
		std1.eat();
	}
}
