package AbstractaAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(how = How.CSS, using="input-city")
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
	
	public WebElement InputName() {
		return firstName; 
	}
	
}
