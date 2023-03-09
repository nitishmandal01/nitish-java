package prob3;

public class ThreadB extends Thread{
	@Override
	public void run(){
		for(int i=400; i>=301; i--) {
			System.out.println("T2 "+i);
		}
	}
}
