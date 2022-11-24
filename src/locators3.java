import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;






public class locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name ="Boney";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Adv K M Varghese\\OneDrive\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String password=getPassword(driver);
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();	
		System.out.println(driver.findElement(By.tagName("p")).getText());
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		

	}
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\ "reset-pwd-btn\"]")).click();
		String passwordText=driver.findElement(By.xpath("form/p")).getText();
		String[] passwordArray = passwordText.split("'");
		String[] passwordArray2=passwordArray[1].split("'");
		String password=passwordArray2[1].split("'")[0];
		return password;
		
		
	}
	
} 
	
