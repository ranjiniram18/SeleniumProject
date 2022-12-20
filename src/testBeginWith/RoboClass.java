package testBeginWith;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboClass {

	public static void main(String[] args) throws AWTException {
		// Set CHrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");

		// Calling the chromedriver and maximising the browser window
		WebDriver driver = new ChromeDriver();

		// Open browser URL

		driver.get("http://my.monsterindia.com/create_account.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='browse-text']")).click();
		// instantiate robo class

		Robot robo = new Robot();
		StringSelection path = new StringSelection("C:\\Users\\HD149PQ\\OneDrive - EY\\Desktop\\seleniumTestData.docx");

		// put the path in a clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);

		// paste the file in the popup to upload file

		robo.keyPress(KeyEvent.VK_ENTER);// press the enter key similar keydown in actions
		robo.keyRelease(KeyEvent.VK_ENTER);
		// control moves to new window
		robo.keyPress(KeyEvent.VK_CONTROL);
		// PAsting it and releasing
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);// press the enter key similar keydown in actions
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}
}
