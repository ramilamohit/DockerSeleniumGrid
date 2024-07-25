package SeleniumGrid;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SetUpSeleniumHub {

	@BeforeMethod
	public void startDockerGrid() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start start_DockerGrid.bat");
		Thread.sleep(15000);
	}
	
	@AfterMethod
	public void stopDockerGrid() throws IOException, InterruptedException
	{	
		Thread.sleep(15000);
		Runtime.getRuntime().exec("cmd /c start stop_DockerGrid.bat");
		Thread.sleep(15000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	    Thread.sleep(15000);

	}

}

//String[] killCommand = {"/bin/bash", "-c", "killall Terminal"};
//Runtime.getRuntime().exec(killCommand);
//Process p = Runtime.getRuntime().exec("cmd /c start CC.bat"); p.waitFor(); Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ;