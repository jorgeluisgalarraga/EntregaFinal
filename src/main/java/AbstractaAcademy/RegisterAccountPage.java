package AbstractaAcademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


/*
 * Esta pagina se usa para registrar a los nuevos usuarios, podria ver si puedo
 * mandar el dataFile con esta misma page.
 */
public class RegisterAccountPage {

	WebDriver driver;

	public RegisterAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CSS, using="#input-firstname")
	private WebElement firstName;
	//By firstName = By.cssSelector("#input-firstname");
	
	@FindBy(how=How.CSS, using="#input-lastname")
	private WebElement lastName; //= By.cssSelector("#input-lastname");
	
	@FindBy(how = How.CSS, using="#input-email")
	private WebElement email; 
	
	@FindBy(how = How.CSS, using="#input-telephone")
	private WebElement telephone;
	
	@FindBy(how = How.CSS, using="#input-company")
	private WebElement company;
	
	@FindBy(how = How.CSS, using="#input-address-1")
	private WebElement address;
	
	@FindBy(how = How.CSS, using="#input-city")
	private WebElement city;
	
	@FindBy(how = How.CSS, using="#input-postcode")
	private WebElement postCode;
	
	@FindBy(how = How.CSS, using="#input-country")
	private WebElement country; 
	
	@FindBy(how = How.CSS, using="#input-zone")
	private WebElement zone;
	
	@FindBy(how = How.CSS, using="#input-password")
	private WebElement password;
	
	@FindBy(how = How.CSS, using="#input-confirm")
	private WebElement passwordConfirm;
	
	@FindBy(how=How.XPATH, using="//input[@name='agree']")
	private WebElement checkAgree;
	
	@FindBy(how=How.XPATH, using="//*[@value='Continue']")
	private WebElement buttonContinue;
	
	public String getTitlePage() {
		return driver.getTitle();
	}
	public void setFirstName(String Text) {
		firstName.sendKeys(Text); 
	}
	
	public void setLastName(String Text) {
		lastName.sendKeys(Text);
	}
	
	public void setEmail(String Text) {
		email.sendKeys(Text);
	}
	
	public void setTelephone(String Text) {
		telephone.sendKeys(Text);	
	}
	
	public void setCompany(String Text) {
		company.sendKeys(Text);		
	}
	
	public void setAddress(String Text) {
		address.sendKeys(Text);
	}
	
	public void setCity(String Text) {
		city.sendKeys(Text);
	}
	
	public void setPostCode(String Text) {
		postCode.sendKeys(Text);
	}
	
	public void selectCountry(String Text) {
		//aqui es un select
		Select select = new Select(country);
		select.selectByVisibleText(Text);
	}
	public void selectZone(String Text) {
		//aqui es un select
		Select select = new Select(zone);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		select.selectByVisibleText(Text);
	}
	
	public void setPassword(String Text) {
		password.sendKeys(Text);
	}
	public void setPasswordConfirm(String Text) {
		passwordConfirm.sendKeys(Text);
	}
	public void clickOnAgreeTerm() {
		//aqui es un click
		checkAgree.click();
	}
	public void clickOnContinueButton() {
		//aqui es un click
		buttonContinue.click();
	}
	
	
}
