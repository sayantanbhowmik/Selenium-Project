package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Locators2 {

	public static WebDriver driver = null;
	public static String getTempPwd() 
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Locators.sleep(1);
		driver.findElement(By.linkText("Forgot your password?")).click(); 
		Locators.sleep(5);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//driver.findElement(By.xpath("//button[text()=\"Reset Login\"]")).click();
		String text = driver.findElement(By.cssSelector("form p")).getText();
	//	Please use temporary password 'rahulshettyacademy' to Login.
		String words[] = text.split("'");
		String pwd = words[1].split("'")[0];
		System.out.println("Temporary password to login: "+pwd);
		return pwd;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Sayantan";
		System.out.println("Chrome Driver starting...");
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		String password = getTempPwd();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Locators.sleep(5);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+","); 
		driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
		Locators.sleep(5);
//		try {
//		driver.close();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			
//		}
		
		
	}
	

}
