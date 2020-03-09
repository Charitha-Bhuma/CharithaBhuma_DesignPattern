package FlyWeight;
import java.util.HashMap;


public class Driver {
	private static final HashMap circleMap = new HashMap();
	public static Shape getSquare(String color) {
		Square s = (Square)circleMap.get(color);
		if(s == null) {
			s = new Square(color);
			circleMap.put(color, s);
			System.out.println("Creating circle of color : " + color);
		}
		return s;
	}
}

