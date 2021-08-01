package ZydaTask.ZydaAutomationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountInformations extends PageBase{

	public AccountInformations(WebDriver driver) {
		super(driver);
	}

	@FindBy (id = "id_gender1")
	WebElement radioBtn;

	@FindBy (xpath = "//input[@name='customer_firstname']")
	WebElement firstText;

	@FindBy (xpath = "//input[@name='customer_lastname']")
	WebElement secondText;

	@FindBy (id = "passwd")
	WebElement passText;

	@FindBy (id = "days")
	WebElement daySelect;

	@FindBy (id = "months")
	WebElement monthSelect;

	@FindBy (id = "years")
	WebElement yearSelect;

	public void PersonalInfo(String namefirst, String namesecond, String password) throws Exception{

		Thread.sleep(5000);
		radioBtn.click();
		Thread.sleep(3000);
		setTextElementText(firstText,namefirst);
		Thread.sleep(2000);
		setTextElementText(secondText,namesecond);
		Thread.sleep(2000);
		setTextElementText(passText,password);
		Thread.sleep(2000);
		Select day = new Select(daySelect);
		day.getOptions().get(4).click();
		Thread.sleep(2000);
		Select month = new Select(monthSelect);
		month.getOptions().get(4).click();
		Thread.sleep(2000);
		Select year = new Select(yearSelect);
		year.getOptions().get(29).click();

	}

}
