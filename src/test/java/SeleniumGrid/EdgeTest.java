package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class EdgeTest extends SetUpSeleniumHub {
	   @Test	   
		public void EdgeNodeTest() throws MalformedURLException, InterruptedException
		{
		    
			EdgeOptions options = new EdgeOptions();
			URL url = new URL("http://localhost:4444/wd/hub");
			RemoteWebDriver driver = new RemoteWebDriver(url,options);
			driver.manage().window().maximize();	
			System.out.println("Edge Browser launched");
			driver.get("https://www.salesforce.com/");
			Thread.sleep(15000);
			String title = driver.getTitle();
			System.out.println("Page title: "+ title);
			driver.close();
			Thread.sleep(15000);

		}

}
