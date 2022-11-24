import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebdriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Adv K M Varghese\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://in.linkedin.com/");
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl());
		driver.close();  

	}

}
