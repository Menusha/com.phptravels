package helpers;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	 
	 public static WebDriver driver = null;
	 
	 @BeforeClass
	 public void initialize() throws IOException, InterruptedException{
	 
     //To open Chrome browser
	 System.setProperty("webdriver.chrome.driver", System.getProperty("C://Users//User//Desktop//Menusha//Eclipse_JavaProject_1_22_2020//jars//chromedriver.exe"));
	 driver = new ChromeDriver(); 
	 
	 //To open Firefox browser
     //System.setProperty("webdriver.gecko.driver", "C://Users//User//Desktop//Menusha//Eclipse_JavaProject_1_22_2020//jars//geckodriver.exe");					
     //driver = new FirefoxDriver();
	 
	 //To maximize browser
	 driver.manage().window().maximize();
	 //Implicit wait
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 //open phptravels
     driver.get("https://www.phptravels.net/login");
	 Thread.sleep(1000);	                
	                
	 }
	 
	 @AfterClass
	 //Test cleanup
	 public void TeardownTest()
	    {
	        TestBase.driver.quit();
	    }
	 
	}
