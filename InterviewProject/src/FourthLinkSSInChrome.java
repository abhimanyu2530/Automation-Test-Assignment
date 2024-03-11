import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthLinkSSInChrome {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.drivers", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.getcalley.com/best-auto-dialer-app/");
	driver.manage().window().maximize();
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File trg = new File("./ScreenShot/bestautochrome.png");
	FileUtils.copyFile(src, trg);
	

	}

}
