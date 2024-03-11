import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotInchromeTask {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.drivers", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.getcalley.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	File trg = new File("./ScreenShot/getcaleey.png");
	FileUtils.copyFile(src, trg);
	
    
	}

}
