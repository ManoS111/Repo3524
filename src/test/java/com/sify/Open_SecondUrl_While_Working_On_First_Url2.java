package com.sify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Open_SecondUrl_While_Working_On_First_Url2 {

	public static void main(String[] args) {
		// WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String firstTab = driver.getWindowHandle();

		// Option 1:
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		// Option 2:
		//driver.switchTo().newWindow(WindowType.TAB);
		
		
		/* Option 3 :Execute JavaScript to open a new tab/window
		((JavascriptExecutor) driver).executeScript("window.open();");

		// Switch to the newly opened tab
		String secondTab = driver.getWindowHandles().toArray()[1].toString();
		driver.switchTo().window(secondTab); */

		// Open the second URL
		driver.get("https://www.flipkart.com/");
		driver.switchTo().window(firstTab);

		driver.quit();
	}
	
}
