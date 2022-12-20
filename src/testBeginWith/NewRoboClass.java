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

public class NewRoboClass {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		// Add files
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]/div/div[1]/span[1]/input")).click();

		// Instantiate Robot class
		Robot robo = new Robot();

		// path where resume file is stored
		StringSelection path = new StringSelection("C:\\Users\\HD149PQ\\OneDrive - EY\\Team_Pic.png");
		robo.delay(2000);
		// put the path in clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);

		robo.delay(2000);
		// paste the file in the CV popup to upload file
		robo.keyPress(KeyEvent.VK_ENTER); // press 'Enter' -similar to key down in Actions class

		robo.delay(2000);
		robo.keyRelease(KeyEvent.VK_ENTER); // release 'Enter' key pressed -similar to key Up in Actions class

		robo.delay(2000);
		robo.keyPress(KeyEvent.VK_CONTROL); // paste the path
		robo.delay(2000);
		robo.keyPress(KeyEvent.VK_V);

		robo.delay(2000);

		robo.keyRelease(KeyEvent.VK_CONTROL);

		robo.delay(2000);
		robo.keyRelease(KeyEvent.VK_V); // release control + V

		robo.delay(2000);
		robo.keyPress(KeyEvent.VK_ENTER); // press 'Enter' -similar to key down in Actions class

		robo.delay(2000);
		robo.keyRelease(KeyEvent.VK_ENTER); // release 'Enter' key pressed -similar to key Up in Actions class

	}
}
