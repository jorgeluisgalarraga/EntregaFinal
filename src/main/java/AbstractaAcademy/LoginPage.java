package AbstractaAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
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
