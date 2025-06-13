import java.net.*;
import java.util.*;

public class NetworkInterfaceExample{
	public static void main(String[]rgs){
	try{
		Enumeration<NetworkInterface>interface=NetworkINterface.GetNetworkINterface();
		while(interface.hasMoreElement()){
			NetworkINterfce ni=interfaces.nextElement();
			System.out.println("InterfaceName:"+ni.getName);
			Enumeration<InetAddress>address=ni.getInetAddresses();
			while(addresses.has)