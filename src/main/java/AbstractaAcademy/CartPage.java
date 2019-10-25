package AbstractaAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;
	

	
	@FindBy(xpath="//tbody//td[6]")
	private WebElement costProduct;
	
	@FindBy(xpath="//table[@class='table table-bordered'] //tr[2]/td")
	private WebElement totalCostProduct;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement continueButton;
	
	private String url;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
		
	
	public String getUrl() {
		url = driver.getCurrentUrl();
		return url;
	}



	public String getCostProduct() {
		return costProduct.getText();
		
	}
	
	public String getTotalCostProduct() {
		return totalCostProduct.getText();
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
}
