package package1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Chrome Driver starting...");
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Locators.sleep(5);
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Locators.sleep(5);
		driver.navigate().back();
		Locators.sleep(5);
		driver.navigate().forward();
		Locators.sleep(5);

	}

}
