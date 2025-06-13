import java.net.*;
import java.io.*;
import java.util.*;
public class ServerSide{

	public static void main(String[] args)throws IOException{
	
	Stirng msg;
	String yn;
	Scanner sc = new Scanner(System.in);

	ServerSocket ss =new ServerSocket(4999);
	Socket s=ss.accept();
	System.out.println("CLient Connected");
	DataInputStream dis=new DataInputStream(s.getInputStream());
	String str=(String)dis.readUTF();
	System.out.println("message="+str);

	ss.close();
}
}