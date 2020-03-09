package Factory;

public class Driver {
	public static void main(String[] args) {
		Perimeter p = new Perimeter();
		Construct p1 = p.getPerimeter("SQAURE");
		p1.perimeter();
		Construct p2 = p.getPerimeter("RECTANGLE");
		p2.perimeter();
	}

}
