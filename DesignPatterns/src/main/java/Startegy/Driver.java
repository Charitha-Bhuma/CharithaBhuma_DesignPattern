package Startegy;

public class Driver{
	public static void main(String[] args) {
		StrategyDemo s = new StrategyDemo(new Add());		
		System.out.println("10 + 10 = " + s.executeStrategy(10, 5));

		s = new StrategyDemo(new Subtract());		
		System.out.println("10 - 10 = " + s.executeStrategy(10, 5));

	}
}