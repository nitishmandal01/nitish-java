package prob1;

public class Main {
public static void main(String[] args) {
	
	Thread currentThread =  Thread.currentThread();
	currentThread.setName("Akshay");
	
	SalmanThreadClass sl = new SalmanThreadClass();
	HritikThreadClass hr= new HritikThreadClass();
	
	
	Thread t1 = new Thread(sl, "Salman");
	Thread t2 = new Thread(hr, "Hritik");
	t1.start();
	t2.start();
	
	try {
		t2.join();
		t1.join();
//		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("End of Main Thread.");
}
}
