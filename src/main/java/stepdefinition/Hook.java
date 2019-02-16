package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;

	@Before()
	public static void beforeMethod() {
		System.out.println("before method");
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\SeleniumStartUp\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@After
	public static void afterMethod() {

		driver.close();
		driver.quit();
		System.out.println("after method");
	}
}
