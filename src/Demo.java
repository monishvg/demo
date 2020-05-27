import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Driver object - Chrome browser
		// We will strictly implement methods of WebDriver
		/*
		 * Invoke .exe file first (browser driver file) 3rd party browsers tools have
		 * restricted selenium to invoke their browsers with their APIs
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); // validation
		// System.out.println(driver.getPageSource());
		driver.get("http://yahoo.com");
		// driver.navigate().back();
		// driver.navigate().forwards();
		driver.close(); // closes current browser
		driver.quit(); // closes all browsers opened by selenium script

	}

}
