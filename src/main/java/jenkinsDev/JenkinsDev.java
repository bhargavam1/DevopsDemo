package jenkinsDev;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class JenkinsDev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			System.out.println("Welcome dude");
			File file = new File("C:\\Users\\Pranay\\Selinium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://www.facebook.com");
			System.out.println("Title: "+driver.getTitle());
			driver.quit();

			  /*driver.get("https://www.aig.com/");  
				String title = driver.getTitle();				 
				Assert.assertTrue(title.contains("Insurance from AIG")); 
				System.out.println("Welcome to Aig");*/
		

	}

}
