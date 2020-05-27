import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.findElement(By.id("custom_date_picker_id_1")).click();
		
		//Grab common attribute
		//Put into list and iterate
		while(!driver.findElement(By.className("ui-datepicker-month")).getText().contains("September"))
				{
					driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
				}
		List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
		
		for(int i = 0; i<dates.size(); i++) {
			String text = dates.get(i).getText();
			if(text.equalsIgnoreCase("29")) {
				dates.get(i).click();
				break;
			}
		}

	}

}
