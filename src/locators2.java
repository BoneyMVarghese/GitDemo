import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Adv K M Varghese\\OneDrive\\Documents\\chromedriver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("inputUsername")).sendKeys("boneyaugust13@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();	
		Thread.sleep(20);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
        
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Boney");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("boneyaugust13@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("boneyvarghese99@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9845673321");
		Thread.sleep(60);
		
		driver.findElement(By.xpath("//button[@class==\"go-to-login-btn\"]")).click();
		System.out.println(driver.findElement(By.xpath("form/p")).getText());
		driver.findElement(By.xpath("div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Boney");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		
		
	}

}


	


