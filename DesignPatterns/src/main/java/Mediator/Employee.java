package Mediator;

public class Employee {
	   private String name;

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public Employee(String name){
	      this.name  = name;
	   }

	   public void sendMessage(String message){
	      Meeting.showMessage(this,message);
	   }
	}