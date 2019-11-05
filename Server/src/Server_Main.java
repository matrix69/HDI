import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Server_Main
{

	static boolean iflog=false;
	Server cloud1;
	Server cloud2;
	Server cloud3;

	static FileWriter serverfw;

	
	public Server_Main() {
		cloud1=new Server(4001);
		cloud2=new Server(4002);
		cloud3=new Server(4003);
	}
	

	public static void main(String[] args) {
	
		try {
			serverfw=new FileWriter(new File("serverlog.txt"));
			
			Server_Main sm=new Server_Main();
			sm.cloud1.start();
			System.out.println("cloud1.port="+sm.cloud1.port);
			sm.cloud2.start();
			System.out.println("cloud2.port="+sm.cloud2.port);
			sm.cloud3.start();
			System.out.println("cloud3.port="+sm.cloud3.port);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	
	}
}


