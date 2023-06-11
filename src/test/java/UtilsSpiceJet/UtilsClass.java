package UtilsSpiceJet;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilsClass {
	
	public static WebDriver driver;
	
	static String url = null;
	String browser = null;

	// TestClass extends BaseClass
	// utils does not extends any
	// BaseClass Extends utils
	// pages extends utils

	// property file
	public static String getProperties(String key) {

		String value = null;
		try {
			Properties prop = new Properties();
			FileInputStream fileInput = new FileInputStream(System.getProperty("user.dir") + "//SpiceJet.file");
			prop.load(fileInput);
			value = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	// launch Url
	public static void launchUrl(String url) {
		try {
		driver.get(url);
		}catch (Exception e){
			
			System.out.println("Not able to initiate URL :" + url);
			
		}
		
	}
	// browser launch
	public static void browserLaunch(String name) {

		switch (name) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("NO Valid option given choosing the default browser");
			
		}

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	// Webdriver Wait method
	public static boolean waitforme(WebElement element) {

		boolean flag = false;

		try {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			flag = true;
		} catch (Exception e) {

			System.out.println("Error Occured while waiting for the element :" + e.getMessage());

		}
		return flag;

	}

	// clicking WebElement
	public void clickElement(WebElement element) {

		try {

			if (waitforme(element)) {

				element.click();

			}
		} catch (Exception e) {

			System.out.println("Error in clicking the WebElement :" + e.getMessage());

		}

	}

	public static boolean getUrl(String url) {

		boolean flag = false;

		try {

			driver.get(url);

		} catch (Exception e) {

			System.out.println("Error in Getting the URL :" + url);

		}

		return flag;
	}
	
	public void action(WebElement element) {
		
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
		
	}
	
	
	//public void select(WebElement element) {
		
		//Select select = new Select((WebElement) driver);
		//select.selectByIndex(0);
		
		
	//}
	
	public void Screenshot(WebDriver webdriver, String fileWithPath) throws Exception {
		
		
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile, new File("C:\\Users\\krishnamoorthy.kasi\\OneDrive - SoftwareONE\\Desktop\\Selenium Original\\TestAutomation\\Screenshot.png"));
		//convert 
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);

		
		
	}

}
