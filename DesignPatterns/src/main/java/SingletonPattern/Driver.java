package SingletonPattern;

public class Driver {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.print();
	}
}
