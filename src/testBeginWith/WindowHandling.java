package testBeginWith;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// Set CHrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");

		// Calling the chromedriver and maximising the browser window
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open browser URL

		driver.get("https://demoqa.com/browser-windows");
		// using xpath
		// driver.findElement(By.xpath("//button[contains(@type,'button')]")).click();
		// driver.findElement(By.xpath("//button[contains(@id,'windowButton')]")).click();

		// uisng xpath -Method 1 -'contains'
		// driver.findElement(By.xpath("//button[contains(@type,'button')]")).click();
		// driver.findElement(By.xpath("//button[contains(@id,'windowButton')]")).click();
		// driver.findElement(By.xpath("//button[contains(@id,'windowB')]")).click();
		// driver.findElement(By.xpath("//*[contains(@id,'windowButton')]")).click();
		// //doesnt click so try next line

		driver.findElement(By.xpath("//*[(@id ='windowButton' and @type = 'button')]")).click();

		// uisng xpath -Method 2 -'starts-with'
		// driver.findElement(By.xpath("//button[starts-with(@id,'win')]")).click();

		// uisng xpath -Method 3 -'text' function
		// driver.findElement(By.xpath("//button[text()='New Window']")).click();
		// driver.findElement(By.xpath("//*[text()='New Window']")).click();

		// button[contains(@id,'windowButton')]

		// CLick on the 'New Window' button
		// driver.findElement(By.id("windowButton")).click();

		// Click on the 'New Window message' button
		WebElement newWindowBtn = driver.findElement(By.id("messageWindowButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", newWindowBtn);

		// Window handling

		// Main window
		String mainWindow = driver.getWindowHandle();
		System.out.println("Main Window Text" + mainWindow);

		// Get multiple window handles and put them into a set
		Set<String> winSet1 = driver.getWindowHandles();

		Iterator<String> itr = winSet1.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			if (!mainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println("Child window ID" + childWindow);

				driver.close();
				System.out.println("Child window closed");
			}
		}

		driver.switchTo().window(mainWindow);
		// driver.quit();

	}

}
