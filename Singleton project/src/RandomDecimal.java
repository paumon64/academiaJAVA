import java.util.Random;

public class RandomDecimal {
	
	private int min = 1;
	private int max = 10;
	private int aleatorio;
	private static RandomDecimal instance = new RandomDecimal();
	Random rand = new Random();

	
	
	public void randomGenetarion() {
		aleatorio = rand.nextInt(max - min + 1) + min;
		
		//return count;
	}
	
	public int getRandom() {
		return aleatorio;
	}
	
	public static RandomDecimal getInstance() {
		return instance;
	}
}