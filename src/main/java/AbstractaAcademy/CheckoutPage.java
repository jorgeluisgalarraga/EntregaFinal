package AbstractaAcademy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class CheckoutPage extends BasePage {
		
	@FindBy(xpath="//input[@value='existing']")
	private WebElement radioExisting;
	
	@FindBy(xpath="//*[@id='button-payment-address']")
	private WebElement buttonContinuePayment;
	
	@FindBy(xpath="//div[@class='alert alert-warning']")
	private WebElement alertPayment;
	
	@FindBy(xpath="textarea[@name='comment']")
	private WebElement commentsArea;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement termsConditions;
	
	@FindBy(xpath="//*[@id='button-payment-method']")
	private WebElement buttonContinueMethod;
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	private WebElement alertDangerPayment;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//Constructor
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isCheckedExistingAccount() {
		return radioExisting.isSelected();
	}
	
	public void clickOnContinuePayment() {
		js.executeScript("arguments[0].click()", buttonContinuePayment);
		//buttonContinuePayment.click();
	}
	
	public boolean alertPaymentIsPresent() {
		return alertPayment.isDisplayed();
	}
	
	public void setCommentsToOrder(String Text) {
		waitTo.until(ExpectedConditions.visibilityOf(commentsArea));
		commentsArea.sendKeys(Text);
	}
	
	public void clickOnTermsConditions(){
		termsConditions.click();
	}
	
	public void clickOnContinueMethod() {
		buttonContinueMethod.click();
	}
	
	public boolean alertMethodIsPresent() {
		return alertDangerPayment.isDisplayed();
	}
}
