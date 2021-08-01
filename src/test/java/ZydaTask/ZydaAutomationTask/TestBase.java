package ZydaTask.ZydaAutomationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {

	public static WebDriver driver ;
	
	@BeforeTest
	public void OpenUrl() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(" http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}
}
