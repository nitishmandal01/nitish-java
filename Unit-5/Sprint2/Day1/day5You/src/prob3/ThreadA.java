package prob3;

public class ThreadA extends Thread{
	@Override
	public void run(){
		for(int i=100; i<=200; i++) {
			System.out.println("T1 "+i);
		}
	}
}
