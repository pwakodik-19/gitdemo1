
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		 driver.findElement(By.xpath("//a[@value='MAA']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		 
	}

}
