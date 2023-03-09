package prob3;

public class ThreadC extends Thread{
	@Override
	public void run(){
		for(int i=601; i<=700; i++) {
			if(isPrime(i))	System.out.println("T2 check "+i+" is Prime");
		}
	}
	
	public boolean isPrime(int n) {
		if(n<1) return false;
		
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) return false;
		}
		
		return true;
		
	}
}