public class Counter {
	private int count;
	private static Counter instance = new Counter();
	
	private Counter() {
		this.count = 2;
	}
	
	public /*int*/ void increment() {
		count++;
		
		//return count;
	}
	
	public int getCount() {
		return count;
	}
	
	public static Counter getInstance() {
		return instance;
	}
}