import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Adv K M Varghese\\OneDrive\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		List<WebElement> dates=driver.findElements(By.className("flatpickr-day"));
		int count=driver.findElements(By.className("flatpickr-day")).size();
		
		
		for(int i=0;i<count;i++) 
		{
			driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("flatpickr-day")).get(i).click();
			}
			
			
			
		}
			

	}

}
