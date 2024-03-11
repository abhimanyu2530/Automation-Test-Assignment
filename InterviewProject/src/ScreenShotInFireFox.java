
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotInFireFox {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.drivers", "./Drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.getcalley.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	File trg = new File("./ScreenShot/getcaleeyfirefox.png");
	FileUtils.copyFile(src, trg);
	
    
	}

}
