package Facade;

public class Facade {

	private Shape rectangle;
	private Shape square;

	public Facade() {

		rectangle = new Rectangle();
		square = new Square();
	}
	public void drawRectangle(){
		rectangle.draw();
	}
	public void drawSquare(){
		square.draw();
	}
}