package AbstractaAcademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'MacBook')]")
	private WebElement macBookProduct;
	
	@FindBy(xpath="//div[@id='content'] //*[@class='button-group']/button[1]")
	private WebElement AddButtonMacBook;
	
	@FindBy(xpath="//div[@class='alert alert-success']//a[contains(text(),'MacBook')]")
	private WebElement macBookAlert;
	
	@FindBy(xpath="//*[contains(text(),'shopping cart')]")
	private WebElement cartAlert;
	
	//para probar el wait
	public WebElement prueba() {
		return macBookProduct;
	}
	//este metodo es para hacerle un assert en el test de que esta disponible
	public String macBookProductText() {
		return macBookProduct.getText();
	}
	
	public void clickOnAddButtonMacBook() {
		AddButtonMacBook.click();
	}
	
	public void clickOnShoppingCartAlert() {
		cartAlert.click();
	}
	
	public boolean alertMacBookIsPresent() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return macBookAlert.isDisplayed();
	}
	
	
}

