import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class treadTest extends Thread{
	
	public void run() {
		try {
			ServerSocket ss = new ServerSocket(4444);
			System.out.println("ok");
			Socket s = ss.accept();
			
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new treadTest().start();
	}
	
	
}
