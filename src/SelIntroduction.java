import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
	// Invoking browser
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver-win64.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
 