package Mediator;

public class Driver {
	public static void main(String[] args) {
		Employee A = new Employee("A");
		Employee B = new Employee("B");
		A.sendMessage("Hi! B");
		B.sendMessage("Hello A!");
	}
}