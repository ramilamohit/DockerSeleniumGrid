package SeleniumGrid;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeTest extends SetUpSeleniumHub {

     @Test
   
	public void ChromeNodeTest() throws MalformedURLException, InterruptedException
	{
    	//DesiredCapabilities dc = new DesiredCapabilities();
    	//dc.setCapability("browsername", "chrome");
		
    	ChromeOptions options = new ChromeOptions();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,options);
		driver.manage().window().maximize();	
		System.out.println("Chrome Browser launched");
		driver.get("https://www.salesforce.com/");
		Thread.sleep(15000);
		String title = driver.getTitle();
		System.out.println("Page title: "+ title);
		driver.close();
		Thread.sleep(15000);

	}

}
