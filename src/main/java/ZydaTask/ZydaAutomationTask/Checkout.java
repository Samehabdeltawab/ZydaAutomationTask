package ZydaTask.ZydaAutomationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Checkout extends PageBase{

	public Checkout(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@title='View my shopping cart']")
	WebElement cartBtn;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	WebElement checkoutBtn;

	@FindBy(xpath = "//button[@name='processAddress']")
	WebElement procBtn;
	
	@FindBy(id ="uniform-cgv")
	WebElement AgreeCheckbox;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	WebElement proceedBtn;
	
	@FindBy(xpath = "//a[@title='Pay by check.']")
	WebElement payBtn;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement confBtn;
	
	@FindBy(xpath = "//p[@class = 'alert alert-success']")
	WebElement ordermessage;



	public void proccedCheckout() throws Exception {

		cartBtn.click();
		Thread.sleep(2000);
		checkoutBtn.click();
		Thread.sleep(2000);
		procBtn.click();
		Thread.sleep(2000);
		AgreeCheckbox.click();
		Thread.sleep(2000);
		proceedBtn.click();
		Thread.sleep(2000);
		payBtn.click();
		Thread.sleep(2000);
		confBtn.click();
		Assert.assertTrue(ordermessage.getText().contains("Your order on My Store is complete."));
	}

}
