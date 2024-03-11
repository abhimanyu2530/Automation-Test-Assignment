import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UplodeFiletask {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.drivers", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='mui-2']")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='sidenavHoverShow css-1s178v5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Orders']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Bulk Orders']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mui-26']")).sendKeys("C:\\Users\\kamat\\Downloads\\demo-data.xlsx");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Import']")).click();
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./ScreenShot/uplodefileSS.png");
		FileUtils.copyFile(src, trg);
		
		

	}

}
