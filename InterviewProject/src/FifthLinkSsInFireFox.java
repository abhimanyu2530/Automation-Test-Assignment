import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FifthLinkSsInFireFox {

	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.gecko.drivers", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.getcalley.com/how-calley-auto-dialer-app-works/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./ScreenShot/autodialerFireFox.png");
		FileUtils.copyFile(src, trg);

	}

}
