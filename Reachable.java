import java.net.*;
import java.io.IOException;

public class ReachableExample
{
	public static void main(String[]args){
	try{
	//Create an InetAddress object for a specific host (e.g.,Google's public DNS server)
	InetAddress address=InetAddress.getByName("8.8.8.8");
	//Check if the address is reachable within a timeout of 1000 milliseconds(1 second)
	boolean isReachable=address.isReachable(1000);//timeout is 1000 milliseconds
	
	if (isReachable){
		System.out.println("The device is reachable");
	}else{
		System.out.println("The device is not reachable within the timeout.");
	}
}catch(IOException e){
System.out.println("An error occur");
}
}
}
	