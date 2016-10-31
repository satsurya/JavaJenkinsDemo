import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaDemo {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:/Users/admin/Downloads/geckodriver-v0.11.1-win64/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("http://www.store.demoqa.com");
         System.out.println("The application site opened successfully");
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
        driver.close();
	}

}
