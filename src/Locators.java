import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Adv K M Varghese\\OneDrive\\Documents\\chromedriver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		driver.findElement(By.id("email")).sendKeys("boneyaugust13@gmail.com");
		driver.findElement(By.name("password")).sendKeys("hello123");
		driver.findElement(By.className("btn-primary")).click();		
		System.out.println(driver.findElement(By.cssSelector("div.bodySmall")).getText());
		driver.findElement(By.linkText("Forgot Password")).click();
		driver.findElement(By.xpath("//label[@for='email']")).sendKeys("boneyaugust13@gmail.com");
		driver.findElement(By.cssSelector("div.form-label")).sendKeys("boneyvarghese99@gmail.com");
	}

}