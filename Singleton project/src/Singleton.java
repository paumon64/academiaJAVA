
public class Singleton {
	
	public void test() {
		Counter classTeste = Counter.getInstance();
		
		classTeste.increment();
		classTeste.increment();
		
		System.out.println("Singleton: Count = " + classTeste.getCount());
		
	
	}
}
