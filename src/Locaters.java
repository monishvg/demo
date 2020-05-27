import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("Thisismyfirstcode");
		driver.findElement(By.cssSelector("#email")).sendKeys("aswdh");
		driver.findElement(By.name("pass")).sendKeys("Password");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		//To generate custom xpath from HTML attributes -- //tagName[@attribute='value']
		//For any tagName, use *
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//To generate custom cssSelector -- tagName[attribute='value']
		//OR for id -- tagName#idvalue
		//OR for class -- tagName.classNamevalue
		//For any TagName, leave blank. e.g. #email
		driver.findElement(By.cssSelector("input[value='Log In'])")).click();
		
		
		
	}

}
