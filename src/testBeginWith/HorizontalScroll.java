package testBeginWith;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalScroll {

	public static void main(String[] args) {
		// Set CHrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");

		// Calling the chromedriver and maximising the browser window
		WebDriver driver = new ChromeDriver();

		// Open browser URL

		driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		driver.manage().window().maximize();

		WebElement f1_head = driver.findElement(By.linkText("VBScript"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", f1_head);
		System.out.println("I have scrolled to the right to show the VBScript element");

	}
}
