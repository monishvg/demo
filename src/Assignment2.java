import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		// Thread.sleep(2000);
		// driver.switchTo().alert().dismiss();
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight ")).click();
		Select Adults = new Select(driver.findElement(By.id("Adults")));
		Adults.selectByValue("4");
		Select Childs = new Select(driver.findElement(By.id("Childrens")));
		Childs.selectByValue("2");
		driver.findElement(By.partialLinkText("More options")).click();
		Select Class = new Select(driver.findElement(By.id("Class")));
		Class.selectByValue("First");
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Emirates");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}

}
