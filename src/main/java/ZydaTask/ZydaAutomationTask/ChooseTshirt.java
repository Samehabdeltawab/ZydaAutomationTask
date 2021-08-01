package ZydaTask.ZydaAutomationTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ChooseTshirt extends PageBase{

	public ChooseTshirt(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	//(linkText = "T-shirts")
	WebElement shirtBtn;
	
	@FindBy(linkText = "Faded Short Sleeve T-shirts")
	WebElement fadedBtn;
	
	@FindBy(xpath = "//button[@name='Submit']")
	//(id = "add_to_cart")
	WebElement CartBtn;
	
	@FindBy (xpath = "//span[@title='Continue shopping']")
	WebElement continBtn;
	
	@FindBy(id = "group_1")
	WebElement sizeSelect;
	
	@FindBy(id = "color_14")
	WebElement colorBtn;

	public void Tshirt() throws Exception{
		Thread.sleep(3000);
		shirtBtn.click();
		Thread.sleep(3000);
		fadedBtn.click();
		Thread.sleep(3000);
		CartBtn.click();
		Thread.sleep(3000);
		continBtn.click();
		Select size = new Select (sizeSelect);
		size.selectByValue("2");
		Thread.sleep(3000);
		colorBtn.click();
		CartBtn.click();
		Thread.sleep(3000);
		continBtn.click();
	}
}
