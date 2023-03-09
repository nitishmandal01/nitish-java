package prob1;

public class HritikThreadClass implements Runnable {
	@Override
	public void run() {
		int product=1;
		for(int i=1; i<10; i++) {
			String tName = Thread.currentThread().getName();
			System.out.println(tName+" is running");
			product *= i;
		}
		System.out.println("Product of all i are: "+product);
		System.out.println("End of HritikThreadClass's run mehtod");
		
	}
}
