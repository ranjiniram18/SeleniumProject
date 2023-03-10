package testBeginWith;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboClassVasu {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("http://my.monsterindia.com/create_account.html");
		// driver.manage().window().maximize(); // scroll to reach upload button
		// JavascriptExecutor j = (JavascriptExecutor)driver;
		// j.executeScript("scroll(0,200)");
		// file path passed as parameter to StringSelection
		driver.findElement(By.xpath(
				"//*[@id=\"registerThemeDefault\"]/div/div[4]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/span"))
				.click();
		Robot r = new Robot();
		StringSelection s = new StringSelection("C:\\Users\\HD149PQ\\seleniumTestData.docx");
		// Clipboard copy
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		r.delay(2000);
		// identify element and click
		// driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[4]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/span")).click();
		// Robot object creation

		// pressing enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.delay(2000);
		// releasing enter
		r.keyRelease(KeyEvent.VK_ENTER);
		// pressing ctrl+v
		r.delay(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.delay(2000);
		r.keyPress(KeyEvent.VK_V);
		// releasing ctrl+v
		r.delay(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(2000);
		r.keyRelease(KeyEvent.VK_V);
		// pressing enter
		r.delay(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.delay(2000);
		// releasing enter
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}