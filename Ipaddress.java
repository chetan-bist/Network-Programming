import java.net.*;
public class Address
{
	public static void main(String []args)throws Exception
	{
		InetAddress ip=InetAddress.getByName("1050:0000:0000:0000:0005:0600:300c:326b");
	//Get IP address of IP V6
	//InetAddree ip=InetAdderess.getlocalHost();
	//Get local IP address
		byte[]bytes=ip.getAddress();//Get IPaddress in byte from
		
		if(bytes.length==4){
		System.out.println("IPv4");
		}
		else if( bytes.length==16){
		System.out.println("IPv6");
		}
		else
		{
		System.out.println("Neither");
		}
	}
}


