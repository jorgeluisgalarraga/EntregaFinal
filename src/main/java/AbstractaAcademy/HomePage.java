package AbstractaAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage{

		
	@FindBy(xpath="//a[contains(text(),'MacBook')]")
	private WebElement macBookProduct;
	
	
	@FindBy(xpath="//div[@class='row'] //*[contains(text(), 'Add to Cart')]")
	private WebElement AddButtonMacBook;
	//FindBy(xpath="//div[@id='content']//div[1]//div[1]//div[3]//button[1]//span[1]")
	
	@FindBy(xpath="//div[@class='alert alert-success']//a[contains(text(),'MacBook')]")
	private WebElement macBookAlert;
	
	
	@FindBy(css=".alert-success [href$='route=checkout/cart']")
	private WebElement cartAlert;
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	//este metodo es para hacerle un assert en el test de que esta disponible
	public String macBookProductText() {
		return macBookProduct.getText();
	}
	
	public void clickOnAddButtonMacBook() {
		Actions action = new Actions(driver);
		action.moveToElement(AddButtonMacBook).click().build().perform();
		//AddButtonMacBook.click();
	}
	
	public void clickOnShoppingCartAlert() {
		waitTo.until(ExpectedConditions.elementToBeClickable(cartAlert));
		cartAlert.click();
	}
	
	public boolean alertMacBookIsPresent() {
		
		waitTo.until(ExpectedConditions.elementToBeClickable(macBookAlert));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return macBookAlert.isDisplayed();
	}
	
	/*public boolean alertMacBookIsPresent() {
		WebDriverWait waitTo = new WebDriverWait(driver, 10);
		waitTo.until(ExpectedConditions.elementToBeClickable(macBookAlert));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return cartAlert.isDisplayed();
	}*/
	
	public boolean webElementIsPresent(WebElement element) {
		waitTo.until(ExpectedConditions.elementToBeClickable(element));
		return element.isDisplayed();
	}

	public WebElement getMacBookAlert() {
		return macBookAlert;
	}

	public void setMacBookAlert(WebElement macBookAlert) {
		this.macBookAlert = macBookAlert;
	}

	public WebElement getCartAlert() {
		return cartAlert;
	}

	public void setCartAlert(WebElement cartAlert) {
		this.cartAlert = cartAlert;
	}
	
	
	
	
	
}

