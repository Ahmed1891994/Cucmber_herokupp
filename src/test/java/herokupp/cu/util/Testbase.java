package herokupp.cu.util;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import herokupp.cu.pages.HomePage;



public class Testbase {
	 public static WebDriver driver ;
	    public static HomePage homepage;
	    public static Logger logger;
	    
	    public void SetUp()
	    {
	    	logger = Logger.getLogger(Testbase.class);
	    	logger.debug("Logger instance Created"); 
	    	
	        logger.error("Setting system property");
	        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
	        logger.debug("Setting system property Applied Successfully");
	        
	        logger.debug("Creating ChromeDriver session");
	        driver = new ChromeDriver();
	        logger.debug("Creating ChromeDriver Applied Successfully");
	        
	        logger.debug("Navigate to URL https://the-internet.herokuapp.com/");
	        driver.get("https://the-internet.herokuapp.com/");
	        
	        logger.debug("Maximize window");
	        driver.manage().window().maximize();
	        
	        logger.info("Create HomePage");
	        homepage = new HomePage(driver);
	    }
	    public void ReturnToHome()
	    {
	    	logger.info("return to HomePage https://the-internet.herokuapp.com/");
	        driver.get("https://the-internet.herokuapp.com/");
	    }

	    public void Quit()
	    {
	    	logger.info("Driver session Ended");
	        driver.quit();
	    }
}
