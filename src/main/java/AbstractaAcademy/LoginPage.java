package AbstractaAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id='input-email']")
	private WebElement emailLogin;
	
	@FindBy(xpath="//*[@id='input-password']")
	private WebElement passwordLogin;
	
	@FindBy(xpath="//*[@value='Login']")
	private WebElement loginButton;
	
	

	public void setEmailLogin(String Text) {
		emailLogin.sendKeys(Text);
	}
	
	public void setPasswordLogin(String Text) {
		passwordLogin.sendKeys(Text);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
}
