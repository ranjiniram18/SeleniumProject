package testBeginWith;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/alerts");
		WebElement prompt1 = driver.findElement(By.id("promtButton"));
		// to click on the button thats not visible without scroll
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", prompt1);

		// switch to alert
		Alert promptAlert = driver.switchTo().alert();
		String msg = promptAlert.getText();
		System.out.println(msg);
		promptAlert.sendKeys("Ranjini");
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
	}
}
