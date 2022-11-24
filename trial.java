import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class trial {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Adv K M Varghese\\OneDrive\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
		driver.findElement(By.id("nav-search-submit-button")).click(); 
		System.out.println(driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).size());
		List<WebElement> results = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for(WebElement iphone_13:results)
		{
			System.out.println(iphone_13.getText());  
		}
		
		driver.findElement(By.linkText("Apple iPhone 13 (128GB) - Blue")).click();
		Set<String>windows=driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		//System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-none aok-align-center']  //span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']  //span[@aria-hidden='true'] //span[@class='a-price-whole']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-none aok-align-center']  //span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']  //span[@aria-hidden='true'] //span[@class='a-price-whole']")).getText());
		String cost =driver.findElement(By.xpath("//div[@class='a-section a-spacing-none aok-align-center']  //span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']  //span[@aria-hidden='true'] //span[@class='a-price-whole']")).getText();
		cost = cost.replaceAll("[^0-9]","");
		System.out.println(cost);
		DecimalFormat decimalFormat = new DecimalFormat("#");
		int n =decimalFormat.parse(cost).intValue();
		if(n>50000)
		{
			System.out.println("The cost is Rs. "+cost);
			System.out.println("Costly");
		}
		else
		{
			System.out.println("cheap");
		}
		
		Select QuantityDropdown =new Select(driver.findElement(By.xpath("//select[@id='quantity']")));
		QuantityDropdown.selectByIndex(1);
		driver.findElement(By.xpath("//span//input[@id='add-to-cart-button']")).click();
		//System.out.println(driver.findElement(By.xpath("//div//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).getText());
//		String selectionstatus=
//		System.out.println(status);
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("//span[@class='a-list-item']")).getText();
		System.out.println(driver.findElement(By.xpath("//span[@class='a-list-item']")).getText()) ;
	}

}
