import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monish\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search/howsearchworks/crawling-indexing/");
		driver.findElement(By.xpath("//a[@href='https://developers.google.com/search/reference/robots_meta_tag?hl=en']")).click();
		
		//set of window ids, parent in 1st row
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
	}

}
