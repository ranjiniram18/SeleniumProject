package testBeginWith;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// Set CHrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");

		// Calling the chromedriver and maximising the browser window
		WebDriver driver = new ChromeDriver();

		// Open browser URL

		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();

		Actions obj1 = new Actions(driver);

		// Right click and double first approach

		/*
		 * WebElement rightbutn = driver.findElement(By.id("rightClickBtn"));
		 * //obj1.contextClick(rightbutn).perform(); //String p =
		 * 
		 *
		 * driver.findElement(By.id("rightClickMessage")).getText();
		 * //System.out.println(p);
		 * 
		 * // Double Click WebElement doublcck =
		 * driver.findElement(By.id("doubleClickBtn"));
		 * obj1.doubleClick(doublcck).perform(); String p1 =
		 * driver.findElement(By.id("doublcck")).getText(); System.out.println(p1);
		 */

		// Another way to performa an action

		/*
		 * WebElement rightbutn = driver.findElement(By.id("rightClickBtn"));
		 * obj1.contextClick(rightbutn);
		 * 
		 * Action action = obj1.build(); obj1.contextClick(rightbutn);
		 * 
		 * // obj1.contextClick(rightbutn).build().perform();//Chaining all build and //
		 * actions in a line
		 */

		// Another approach
		WebElement rightbutn = driver.findElement(By.id("rightClickBtn"));
		obj1.moveToElement(rightbutn).contextClick().build().perform();

		// Click the click me button

		WebElement clickme = driver.findElement(By.xpath("//button[@text='Click Me']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", clickme);
		// js.executeScript("arguments[0[.s", args)

		obj1.moveToElement(clickme).contextClick().build().perform();

		System.out.println("************************");
	}
}

//https://demoqa.com/menu/
