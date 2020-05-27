import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Select a checkbox- grab the label(put into variable)
		WebElement option = driver.findElement(By.id("checkBoxOption3"));
		option.click();
		String label = option.getAttribute("value");
		System.out.println(label);
		
		//Select same option in dropdown
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByValue(label);
		
		//Enter label text in editbox
		driver.findElement(By.id("name")).sendKeys(label);
		
		//Click Alert and verify if text grabbed is present in alert
		driver.findElement(By.id("alertbtn")).click();
		String message = driver.switchTo().alert().getText();
		Assert.assertTrue(message.contains("Hello " + label));
		

	}

}
