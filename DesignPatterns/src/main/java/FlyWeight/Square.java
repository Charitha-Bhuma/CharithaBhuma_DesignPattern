package FlyWeight;

public class Square implements Shape {
	private String color;
	private int x;
	private int y;
	private int side;

	public Square(String color){
		this.color = color;		
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public void draw() {
		System.out.println("Color : " + color + ", x : " + x + ", y :" + y + ", side :" + side);
	}
}