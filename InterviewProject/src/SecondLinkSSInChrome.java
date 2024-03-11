import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondLinkSSInChrome {

	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.chrome.drivers", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.getcalley.com/calley-call-from-browser/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./ScreenShot/caleeycallchrome.png");
		FileUtils.copyFile(src, trg);

	}

}
