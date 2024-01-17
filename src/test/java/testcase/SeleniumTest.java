package testcase;


	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class SeleniumTest {
	    private static final Logger logger = LogManager.getLogger(SeleniumTest.class);

	    public static void main(String[] args) {
	        // Set the system property for ChromeDriver
//	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize WebDriver
	        WebDriver driver = new FirefoxDriver();
	        WebDriverManager.firefoxdriver().setup();
	        // Log messages
	        logger.info("WebDriver initialized.");

	        // Your Selenium code goes here...

	        // Log a message when the test is complete
	        logger.info("Test execution complete.");

	        // Close the WebDriver
	        driver.quit();
	    }
	}


