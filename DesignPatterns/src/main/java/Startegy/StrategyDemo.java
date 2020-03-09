package Startegy;

public class StrategyDemo {
	   private Strategy strategy;

	   public StrategyDemo(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	   }
	}