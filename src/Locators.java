import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver-win64.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("priyanka");
		driver.findElement(By.name("inputPassword")).sendKeys("gfhgh");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		//	Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Piyu");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("piyu@gh.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Priyanka@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("09859809789");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		
	}

}

