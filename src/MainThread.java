import java.util.Scanner;

public class MainThread {

	public static void main(String[] args){
		Thread counter = new Thread(new Counter());
		counter.start();
		Scanner sc = new Scanner(System.in);
		String s = "start";
		while(!s.equals("")){
			s = sc.nextLine();
		
		}
		counter.interrupt();
	}
	
	
}
