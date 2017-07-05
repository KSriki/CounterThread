
public class Counter implements Runnable {
	
	@Override
	public void run() {
		Thread cThread = Thread.currentThread();
		int count = 1;
		// TODO Auto-generated method stub
		while(!cThread.isInterrupted()){
			System.out.println(cThread.getName() + " count " + count);
			count++;
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				break;
			}
			
		}
		System.out.println(cThread.getName() +" interrupted.");
	}
	
}
