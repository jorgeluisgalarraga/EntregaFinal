package AbstractaAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//tbody//td[6]")
	private WebElement costProduct;
	
	@FindBy(xpath="//table[@class='table table-bordered'] //tr[2]/td[2]")
	private WebElement totalCostProduct;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement continueButton;
	
	public void getCostProduct() {
		costProduct.getText();
	}
	
	public void getTotalCostProduct() {
		totalCostProduct.getText();
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
}
