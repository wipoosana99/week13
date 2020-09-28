package week13;

public class Human2 {
	void work() {
		System.out.println("Human can work");
	}
	void eat() {
		System.out.println("Engineer can eat");
	}
}
class Engineer2 extends Human2{
	void run() {
		System.out.println("Engineer can run");
	}
}
class Student2 extends Human2{
	public static void main(String[]args) {
		Student2 std1 = new Student2();
		Engineer2 e = new Engineer2();
		std1.work();
		std1.eat();
		e.run();
	}
}