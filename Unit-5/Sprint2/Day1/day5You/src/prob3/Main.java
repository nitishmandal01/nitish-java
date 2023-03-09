package prob3;

public class Main {
public static void main(String[] args) {
	ThreadA a = new ThreadA();
	Thread t1 = new Thread(a, "T1");
	
	ThreadB b = new ThreadB();
	Thread t2 = new Thread(b, "T2");
	t2.setPriority(7);
	
	ThreadC c = new ThreadC();
	Thread t3 = new Thread(c, "T3");
	t3.setPriority(3);
	
	t1.start();
	t2.start();
	t3.start();
	
	try {
		t1.join();
		t2.join();
		t3.join();
		System.out.println("T1,T2 & T3 finished");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

}
