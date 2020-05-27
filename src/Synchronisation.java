import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronisation {

	public static void main(String[] args) {

		/*
		 * Synchronisation is a mechanism which involves two or more components working
		 * parallel with each other. e.g. application under test and the test automation
		 * tool. Conditional Synchronisation: implicit, explicit, fluent wait
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		/*
		 * IMPLICIT WAIT - Wait maximum specified amount of time before exception thrown
		 * PRO: Defined globally - applied for whole driver instance
		 * PRO: Readable code
		 * CON: Unable to test some performance issues 
		 * (e.g. if search takes 10secs instead of 5, unable to detect with 10 secs wait)
		 * + slow execution time (e.g. cities n country) 
		 */

		/*
		 * EXPLICIT WAIT - a wait statement for certain conditions will be defined for a scenario 
		 * which should be satisfied within the specified timeout period.
		 * The code will be executed if the element is found within the specified time.
		 * PRO: Wait is applied only at targeted elements - no performance issues
		 * CON: More code
		 * WebDriverWait + FluentWait: both classes that implement Wait interface
		 * FluentWait finds Web elemnt repeatedly at regular intervals of time
		 * AND needs customised wait methods based on condition
		 */
	}

}
