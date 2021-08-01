package ZydaTask.ZydaAutomationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOut extends PageBase{

	public SignOut(WebDriver driver) {
		super(driver);

	}

	@FindBy(linkText = "Sign out")
	WebElement signoutBtn;


	public void logout() throws Exception {

		signoutBtn.click();
		Thread.sleep(2000);
	}
}
