package SingletonPattern;

class Singleton{  
	private static Singleton obj;  
	private Singleton(){}  

	public static Singleton getInstance(){  
		return obj;  
	}  

	public void print(){  
		System.out.println("Hello World");
	}  
}  
