package testBeginWith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {
	public static void main(String[] args) {
		// Set CHrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");

		// Calling the chromedriver and maximising the browser window
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open browser URL

		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");

		// WebElement frame1=driver.findElement(By.id("frame1"));

		// get the first if
		WebElement f1_head = driver.findElement(By.id("sampleHeading"));
		String f1 = f1_head.getText();
		System.out.println(f1);
		// go back to main page and get the text

		driver.switchTo().defaultContent();

		String main_p = driver.findElement(By.xpath("//div[@id='framesWrapper']/child::div")).getText();
		System.out.println(main_p);

	}

}

/*
 * Scroll down the page- use javascript executor - 4 methods are possible Scroll
 * By pixels Scroll to element Scroll to page end Horizontal scroll (not used
 * frequently)
 */
