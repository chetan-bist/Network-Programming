import java.net.URI;
import java.net.URISyntaxException;

	public class URIDemo{
		
		public static void main(String[]args){
			
			try{
				URI uri = new URI("http://www.ietf.org/rfc/rfc3966.txt");
				
				System.out.println("scheme:"+uri.getScheme());
				System.out.println("Authority :"+uri.getAuthority());
				System.out.println("path: "+uri.getPath());
			}catch(URISyantaxException e){
				e.printStackTrace();
			}
		}
	}