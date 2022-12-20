package testBeginWith;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotMouseEvents {
	public static void main(String[] args) throws AWTException {
		// Set CHrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");

		// Calling the chromedriver and maximising the browser window
		WebDriver driver = new ChromeDriver();

		// Open browser URL

		driver.get("http://my.monsterindia.com/create_account.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='browse-text']")).click();

		// Instantiate Robot class
		Robot robo = new Robot();
		Dimension dim = driver.manage().window().getSize();
		// adjusting the dimensions to find x and y coordinates
		System.out.println("Dimension of x and y:" + dim.getWidth() + dim.getHeight());
		int x = (dim.getWidth() / 4);
		int y = (dim.getHeight() / 10) + 50;

		robo.mouseMove(x, y);

		robo.delay(3000);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);// Button 1 is left mouse button so its left click
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robo.delay(3000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.delay(3000);
		robo.keyRelease(KeyEvent.VK_ENTER);
		/*
		 * robo.mouseMove(x, y); robo.delay(3000);
		 * robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);// left mouse click is button1
		 * down mask robo.delay(3000);
		 * robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);// left mouse click is
		 * button1 down mask robo.delay(3000); robo.keyPress(KeyEvent.VK_ENTER);
		 * robo.delay(2000); robo.keyRelease(KeyEvent.VK_ENTER);
		 */

	}
}
