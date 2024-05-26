package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Chrome Driver starting...");
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Locators.sleep(2); 
		//driver.findElement(By.xpath("//a[@value=\"CCU\"]")).click(); 
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_originStation1_CTNR\"] //a[@value=\"CCU\"]")).click();
		Locators.sleep(2);
		//driver.findElement(By.xpath("(//a[@value=\"IXB\"])[last()]")).click();
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"IXB\"]")).click();
		Locators.sleep(5);
		//==============================================================//
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value=\"IXB\"]")).click();
		Locators.sleep(5);
		
		
		

	}

}
