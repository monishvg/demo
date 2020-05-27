import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffRegExpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://rediff.com");
		//When value of attribute changes or too long, use Regular expression
				//For xpath-- //tagName[contains(@attribute,'value')]
				//e.g. //input[contains(@name,'username')]
				
				//For css-- tagName[Attribute*='value']
				//e.g. input[name*='username']
		
		//driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//div[@class='logobar']/div/div[3]/p/a[1]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("aoshd");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
	}

}
