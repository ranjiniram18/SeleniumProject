package testBeginWith;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) {
		// Set CHrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");

		// Calling the chromedriver and maximising the browser window
		WebDriver driver = new ChromeDriver();

		// Open browser URL

		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Ranjini");
		driver.findElement(By.id("userEmail")).sendKeys("ranjini@gmail.com");

		WebElement curradr = driver.findElement(By.id("currentAddress"));
		curradr.sendKeys("123,cycolony,pune");

		Actions act = new Actions(driver);
		// act.keyDown(Keys.CONTROL);// press downkeys
		// act.sendKeys("a");
		// act.keyUp(Keys.CONTROL);// press up keys
		// act.build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//// performing all above actions in a line

		// act.keyDown(Keys.CONTROL);// press downkeys
		// act.sendKeys("c");
		// act.keyUp(Keys.CONTROL);// press up keys
		// act.build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		// performing all above actions in a line

		// act.sendKeys(Keys.TAB);
		// act.build().perform();
		act.sendKeys(Keys.TAB).build().perform();// Above two lines in a single line
		WebElement paddr = driver.findElement(By.id("permanentAddress"));
		// act.keyDown(Keys.CONTROL);// press downkeys
		// act.sendKeys("v");
		// act.keyUp(Keys.CONTROL);// press up keys

		// act.build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		// performing all above actions in a line

		/*
		 * just sending the keys directly
		 *
		 * curradr.sendKeys(Keys.CONTROL); curradr.sendKeys("A");
		 * 
		 * curradr.sendKeys(Keys.CONTROL); curradr.sendKeys("C");
		 * 
		 * WebElement paddr = driver.findElement(By.id("permanentAddress"));
		 * 
		 * paddr.sendKeys(Keys.CONTROL); paddr.sendKeys("V");
		 */

	}
}
