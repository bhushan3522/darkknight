package firstPgm;

public class StaticVar {

	static int a = 10;
	static int b = 20;
	
	
	public static void main(String[] args) {
		
		StaticVar obj1 = new StaticVar();
		obj1.a = 100;
		obj1.b = 200;
		
		StaticVar obj2 = new StaticVar();
		
		
		System.out.println("obj1.a : "+obj1.a+ " obj1.b : "+obj1.b+ "\n" +
				" obj2.a : "+obj2.a + " obj2.b : "+obj2.b);

	}

}
