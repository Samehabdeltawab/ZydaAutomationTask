package ZydaTask.ZydaAutomationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends PageBase{

	public SignIn(WebDriver driver) {
		super(driver);
	}

	@FindBy (linkText = "Sign in")
	WebElement SigninBtn;

	@FindBy(id = "email")
	WebElement mailText;

	@FindBy(id = "passwd")
	WebElement passText;

	@FindBy(id = "SubmitLogin")
	WebElement logBtn;


	public void login(String mail, String pass) throws Exception {

		SigninBtn.click();
		Thread.sleep(5000);
		setTextElementText(mailText, mail);
		Thread.sleep(2000);
		setTextElementText(passText, pass);
		Thread.sleep(2000);
		logBtn.click();
		Thread.sleep(3000);
	}

}
