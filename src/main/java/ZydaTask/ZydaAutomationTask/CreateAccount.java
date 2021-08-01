package ZydaTask.ZydaAutomationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount extends PageBase{

	public CreateAccount(WebDriver driver) {
		super(driver);
	}

	@FindBy (linkText = "Sign in")
	WebElement SigninBtn;

	@FindBy (id = "email_create")
	WebElement emailadressText;

	@FindBy (id = "SubmitCreate")
	WebElement createBtn;
	
	public void CreateData(String email) throws Exception{

		SigninBtn.click();
		Thread.sleep(2000);
		setTextElementText(emailadressText, email);
		createBtn.click();
		Thread.sleep(5000);
	}
}
