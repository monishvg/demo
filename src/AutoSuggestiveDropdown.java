import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity")).click();
		WebElement source = driver.findElement(By.xpath("//*[@placeholder='From']"));
		source.click();
		source.clear();
		source.sendKeys("MUM");
		Thread.sleep(1000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("toCity"));
		WebElement destination = driver.findElement(By.xpath("//*[@placeholder='To']"));
		destination.click();
		destination.clear();
		destination.sendKeys("DEL");
		Thread.sleep(1000);
		for(int i=1;i<5;i++) {
			destination.sendKeys(Keys.ARROW_DOWN);
			}
		
		destination.sendKeys(Keys.ENTER);

}
	

}
