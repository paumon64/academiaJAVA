
public class Singleton2Random {

	public void test() {
		
	RandomDecimal classTeste2 = RandomDecimal.getInstance();
	
	classTeste2.randomGenetarion();
	
	System.out.println("Singleton: Random = " + classTeste2.getRandom());
	
	}
}

