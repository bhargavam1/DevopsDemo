package jenkinsDemo;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	//private WebDriver driver;
	
	@Test
	public void testcase1() {
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

	/*@BeforeTest
	  public void beforeTest() {
		  driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		  
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }*/
}
