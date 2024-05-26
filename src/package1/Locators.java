package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static WebDriver driver = null;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
		System.out.println("Chrome Driver starting...");
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		//sleep(2);
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		//sleep(3);
		driver.findElement(By.className("signInBtn")).click();
	//	sleep(1);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click(); 
		driver.findElement(By.xpath("//*[@placeholder=\"Name\"]")).sendKeys("john");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("abc@gs.com");
		sleep(2);
		driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).clear();
		sleep(2);
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("abcSb@gmail.com");
		sleep(2);
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9231456789");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); 
		driver.findElement(By.xpath("//div[contains(@class,\"pwd-btn\")]/button[1]")).click();
		sleep(1);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click(); 
		driver.findElement(ByXPath.xpath("//button[contains(@class,\"submit\")]")).click();
		sleep(10);
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	public static void sleep(long m)
	{
		try {
			Thread.sleep(m*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
