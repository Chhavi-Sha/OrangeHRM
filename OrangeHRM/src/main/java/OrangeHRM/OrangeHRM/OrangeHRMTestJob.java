package OrangeHRM.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTestJob {
	
	WebDriver driver;
	@Test
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chhsh\\Desktop\\SelJar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		System.out.println(driver.getTitle());
	
	}

}
