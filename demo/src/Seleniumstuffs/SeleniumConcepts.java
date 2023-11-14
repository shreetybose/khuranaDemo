package Seleniumstuffs;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumConcepts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/piyush/Desktop/SHREETY_SELENIUM_JAVA_STUFFS/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //global wait
		driver.get("https://www.spicejet.com/");
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("/Users/piyush/Desktop/SHREETY_SELENIUM_JAVA_STUFFS/BatchScreenshots1.png");
		FileUtils.copyFile(src, dest);
		
		
		
		
		

	}

}
