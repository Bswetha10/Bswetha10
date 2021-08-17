package Week2Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Create New Account")).click();

		driver.findElement(By.name("firstname")).sendKeys(" Swetha");

		driver.findElement(By.name("lastname")).sendKeys("Babu");

		driver.findElement(By.name("reg_email__")).sendKeys(" swethababu100100@gmail.com");

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("swethababu100100@gmail.com");

		driver.findElement(By.id("password_step_input")).sendKeys("swetha10@");

		WebElement drop1 = driver.findElement(By.name("birthday_day"));

		Select drpDwn = new Select(drop1);

		drpDwn.selectByValue("10");

		WebElement drop2 = driver.findElement(By.name("birthday_month"));

		Select drpDwn1 = new Select(drop2);

		drpDwn1.selectByVisibleText("Jan");

		WebElement drop3 = driver.findElement(By.name("birthday_year"));

		Select drpDwn2 = new Select(drop3);

		drpDwn2.selectByValue("2000");

	}

}
