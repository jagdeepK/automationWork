import java.net.URI;
import java.net.URL;

import io.selendroid.SelendroidDriver;
import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.common.device.DeviceTargetPlatform;
import io.selendroid.standalone.SelendroidConfiguration;
import io.selendroid.standalone.SelendroidLauncher;

import org.openqa.selenium.WebDriver;


public class FirstMobileTest {

	
	public static void main(String arg[]) throws Exception{
		
		String str =new String();
		System.out.println("str is"+str.valueOf(false));
		 WebDriver driver;
		SelendroidConfiguration config = new SelendroidConfiguration();
        
	      // Add the selendroid-test-app to the standalone server
	        config.addSupportedApp("Guru99App.apk");
		        
           
	        //start the standalone server
	        SelendroidLauncher selendroidServer = new SelendroidLauncher(config);
		        selendroidServer.launchSelendroid();
	        
	       // Create the selendroid capabilities
	        SelendroidCapabilities capa = new SelendroidCapabilities();
		        
  
	       // Specify to use selendroid's test app
	        capa.setAut("com.guru99app:1.0");
		       
	       // Specify to use the Android device API 19
	        capa.setPlatformVersion(DeviceTargetPlatform.ANDROID19);
		        
	        // Don't request simulator, use real device
	        //capa.setEmulator(true);
		        
   
	        //capa.wait(10000000);
	        
	        // Create instance of Selendroid Driver
	        driver = new SelendroidDriver(capa);
	        System.out.println("Starting Trst");
	}
}
