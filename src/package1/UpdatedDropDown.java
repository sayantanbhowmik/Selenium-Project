package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Chrome Driver starting...");
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();//Passenger dropdown
		Locators.sleep(2);
//		int i=1;
//		while(i<5)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();//selecting Adult
		}
		for(int i=1;i<3;i++)
		{
			driver.findElement(By.id("hrefIncChd")).click();//Selecting child
		}
		for(int i=1;i<3;i++)
		{
			driver.findElement(By.id("hrefIncInf")).click();//Selecting Infant
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
