import java.lang.*;
public class CounterThread extends Thread{
	
	private int count = 0;
	public synchronized int getCount(){
		return count;
		
	}
	public synchronized void setCount(int count){
		this.count = count;
	}
	
	
	
	
	public static void main(String[] args){
		
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread ct = Thread.currentThread();
		
	}
	
	

}
