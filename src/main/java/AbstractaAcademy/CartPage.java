package AbstractaAcademy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class CartPage extends BasePage {
	
	@FindBy(xpath="//tbody//td[6]")
	private WebElement costProduct;
	
	@FindBy(xpath="//strong[text()=\"Total:\"]/../following-sibling::td")
	private WebElement totalCostProduct;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement continueButton;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
	private String url;

	//Constructor
	public CartPage(WebDriver driver) {
		super(driver);		
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
		waitTo.until(ExpectedConditions.visibilityOf(continueButton));
		js.executeScript("arguments[0].click();", continueButton);
		
	}
}
