package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup {
	
	private WebDriver driver;
	
	public Signup(WebDriver d) {
		driver=d;
	}
	
	//--------------Object Repository----------------
	
	private By Signuplink= By.xpath("//a[contains (text(),'Sign up')]");
	
	private By Username_textbox =By.xpath("//input[@id='sign-username']");
	
	private By Pass_TextBOx= By.xpath("//input[@id='sign-password']");
	
	private By Signupbtn= By.xpath("//button[contains (text(),'Sign up')]");
	
	//-----action methods--------
	
	public void signuplink() {
		driver.findElement(By.xpath("//a[contains (text(),'Sign up')]")).click();
	}
	
	public void enterUserName(String username) {
		driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys(password);
	}
	public void signupbtnclick() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains (text(),'Sign up')]")).click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	public void quitBrowser() {
		driver.quit();
	}
}
