package prob1;

public class SalmanThreadClass implements Runnable {

	@Override
	public void run() {
		int sum = 0;
		for(int i=1; i<10; i++) {
			String tName =  Thread.currentThread().getName();
			System.out.println(tName+" is running.");
			
			sum+=i;
		}
		System.out.println("sum of all i is "+sum);
		System.out.println("End of SalmanThreadClass's run mehtod");
		
	}

}
