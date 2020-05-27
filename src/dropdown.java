import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://book.spicejet.com/");

		// CHECKBOXES
		driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizen']")).isSelected());
		// COUNT NO.OF CHECKBOXES
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// Validating UI element enabled/disabled using attributes
		// driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
		if (driver.findElement(By.id("spclearDate")).getAttribute("style").contains("block")) {
			System.out.println("Round trip selected");
			Assert.assertTrue(false);
		} else {
			Assert.assertTrue(true);
		}

		// DYNAMIC DROPDOWN
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"))
				.click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		// OR use parent-child xpath instead of index
		driver.findElement(By.xpath(
				"//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		// DATE
		// css used with classname -- where spaces, add "."
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		driver.findElement(By.id("divpaxinfo")).click();
		Select adults = new Select(driver.findElement(
				By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		adults.selectByValue("4");

		// STATIC DROPDOWN: works if tag - select and option
		Select currency = new Select(driver
				.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
		currency.selectByValue("USD");
		currency.selectByIndex(1);
		currency.selectByVisibleText("INR");

		driver.findElement(By.cssSelector(".bookbtn")).click();

		/*
		 * driver.findElement(By.id("divpaxinfo")).click(); Thread.sleep(2000L); int
		 * i=1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click();//4 times
		 * i++; }
		 * 
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 * 
		 * for(int i=1;i<5;i++) { driver.findElement(By.id("hrefIncAdt")).click(); }
		 * 
		 * driver.findElement(By.id("btnclosepaxoption")).click();
		 * Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),
		 * "5 Adult");
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 */

	}

}
