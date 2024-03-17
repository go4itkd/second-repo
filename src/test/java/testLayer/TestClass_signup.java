package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.Signup;

public class TestClass_signup {
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		Signup up= new Signup(driver);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://demoblaze.com/index.html#");
		
		up.signuplink();
		
		up.enterUserName("useracces123");
		
		up.enterPassword("12345678");
		
		up.signupbtnclick();
		
		up.quitBrowser();
	}

}
