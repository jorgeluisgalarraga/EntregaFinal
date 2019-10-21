package AbstractaAcademy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/*
 * Esta pagina se usa para ir registrar a los nuevos usuarios, agregar productos
 * al carrito, buscar los productos desde la barra de busqueda
 * conforme avance voy a ver que mas se agregar aca.
 * mandar el dataFile con esta misma page.
 */
public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using="//*[contains(a,'My Account')]")
	private WebElement myAccountMenu; //el "My Account" que esta en el menu
	
	@FindBy(how = How.XPATH, using="//*[contains(a,'My Account')] //*[contains(a,'Register')]")
	private WebElement Register; //cuando no se esta logeado es para registrarse
	
	@FindBy(how=How.XPATH, using="//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'My Account')]")
	private WebElement myAccountlink; //capturar este elemento y que su texto diga "My Account"
	
	
	@FindBy(how=How.XPATH, using="//*[@id='top'] //*[contains(text(),'Logout')]")
	private WebElement logoutLink; //boton de logout
	
	@FindBy(xpath="//*[@id='logo']")
	private WebElement openCartImage;
	
	public void clickOnMyAccountMenu() {
		myAccountMenu.click();
	}
	
	public void clickOnRegisterLink() {
		Register.click();
	}
	
	public String registerLinkText() {
		return Register.getText();
	}
	
	public void clickOnLogoutLink() {
		logoutLink.click();
	}
	
	public void clickOnLogo() {
		openCartImage.click();
	}
	
	public WebElement logo() {
		return openCartImage;
	}

}
