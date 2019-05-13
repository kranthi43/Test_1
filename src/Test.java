import java.nio.file.Paths;
import java.text.MessageFormat;

import org.junit.Assert;

public class Test {

	public static String webURL="https://voice.google.com/about";
	public static int port = 1234;
	
	public static void main(String[] args) {
		/*try{
		Assert.assertEquals("KK", true, false);
		}catch (Exception e) {
			System.out.println("MM");
		}*/
		
		 final String dir = System.getProperty("user.dir");
	        System.out.println("current dir = " + dir);
	     System.out.println(Paths.get("").toAbsolutePath());
	     
	     System.out.println(MessageFormat.format("GGGGGG{0,number}", port));
	     
	     CLASS_TYPE class_TYPE = CLASS_TYPE.BYE;
	     switch (class_TYPE) {
		case BYE:
			
			
			break;

		default:
			break;
		}
	     
	}
}
