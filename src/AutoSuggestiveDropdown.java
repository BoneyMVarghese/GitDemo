import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Adv K M Varghese\\OneDrive\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.id("autosuggest")).sendKeys("Ger");
		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//a[text()='India']"));
		//		Thread.sleep(10000);
		List<WebElement> options =driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		for(WebElement option :options)
		{
			System.out.println(option.getText());
			if(option.getText().equals("Germany"))
				try {
					option.click();
				} catch (Exception e) {

					executor.executeScript("arguments[0].click();", option);
				}
			
		}

	}

}
