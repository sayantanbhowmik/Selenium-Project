package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class SelIntroduction {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Chrome Driver starting...");
		//System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver = new ChromeDriver();
		
//		System.out.println("Firefox Driver starting...");
//		System.setProperty("webdriver.gecko.driver", "src/geckodriver.exe");
//		System.setProperty("webdriver.http.factory", "jdk-http-client");
//		WebDriver driver = new FirefoxDriver();
		
//		System.out.println("Edge Driver starting...");
//		System.setProperty("webdriver.edge.driver", "src/msedgedriver.exe");
//		System.setProperty("webdriver.http.factory", "jdk-http-client");
//		WebDriver driver = new EdgeDriver();
		
		
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Title of the page: "+driver.getTitle());
		System.out.println("Currently opened URL: "+driver.getCurrentUrl());
		
		//driver.close();
		
		
		
		
	}

}
