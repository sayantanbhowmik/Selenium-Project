package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Chrome Driver starting...");
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Locators.sleep(10);
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//Locators.sleep(5);
	//If in the dropdown tag stating wtih <Select> then its static dropdown
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		//Locators.sleep(5);
		System.out.println(dropdown.getFirstSelectedOption().getText()+" Currency selected from the static dropdown");
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText()+" Currency selected from the static dropdown");
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText()+" Currency selected from the static dropdown");
	}

}
