import java.net.*; //import all network classes
import java.io.*;

public class ClientSide{

	public static void main (String[] args) throws IOException{
		
			Socket s = new Socket("192.168.1.244",4999);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("hello server");

		dout.flush();
		dout.close();
		s.close();
}
}