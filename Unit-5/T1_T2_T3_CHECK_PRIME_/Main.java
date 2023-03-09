package prob3;

// //Create three threads (named T1, T2 & T3) by Extending thread class such that
//
//- Thread T1 should print all prime numbers from 201 to 300
//- Thread T2 should print all prime numbers from 400 to 301
//- Thread T3 should print all prime numbers from 601 to 700
//- Execution of T2 and T3 should start after completion of threads T1
//- Priority of thread T2 & T3 should be 7 & 3 respectively
//- use join method to make sure that main thread must finish at the end of child thread


public class Main {
public static void main(String[] args) {
	ThreadA a = new ThreadA();
	Thread t1 = new Thread(a, "T1");
	t1.start();
	
	try {
		t1.join();
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	ThreadB b = new ThreadB();
	Thread t2 = new Thread(b, "T2");
	t2.setPriority(7);
	
	ThreadC c = new ThreadC();
	Thread t3 = new Thread(c, "T3");
	t3.setPriority(3);
	
	
	t2.start();
	t3.start();
	
	try {
		t2.join();
		t3.join();
		System.out.println("T1,T2 & T3 finished");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

}
