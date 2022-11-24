import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class coursera_website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Adv K M Varghese\\OneDrive\\Documents\\chromedriverNov2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.coursera.org/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[@class='cds-33 long-label css-19v6seh cds-35']"))).build().perform();
		System.out.println(driver.findElement(By.xpath("//span[@class='cds-33 long-label css-19v6seh cds-35']")).getText());
		WebElement footerdriver=driver.findElement(By.xpath("//li//a[@data-click-key=\"front_page.front_page_story.click.seo_directory_link\"]"));
		System.out.println(footerdriver.findElements(By.tagName("a")). );
		


	}

}
