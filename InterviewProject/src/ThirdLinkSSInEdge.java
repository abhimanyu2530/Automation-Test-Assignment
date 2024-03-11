import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ThirdLinkSSInEdge {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.msedge.drivers", "./Drivers/msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.getcalley.com/calley-pro-features/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	File trg = new File("./ScreenShot/caleeyProedge.png");
	FileUtils.copyFile(src, trg);
	
    
	}

}
