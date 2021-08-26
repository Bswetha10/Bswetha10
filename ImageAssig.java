package week3Assig;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageAssig {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElementByXPath("//label[text()='Click on this image to go home page']/following::input").click();
		System.out.println("Home page has been displayed");
		driver.navigate().back();
		Thread.sleep(30);

		driver.findElementByXPath("//label[text()='Click me using Keyboard or Mouse']/following::input").click();
		System.out.println("Home page has been displayed");
		driver.navigate().back();
		Thread.sleep(30);

		driver.quit();

	}

}
