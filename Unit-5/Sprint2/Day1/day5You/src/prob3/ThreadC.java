package prob3;

public class ThreadC extends Thread{
	@Override
	public void run(){
		for(int i=601; i<=700; i++) {
			System.out.println("T3 "+i);
		}
	}
}