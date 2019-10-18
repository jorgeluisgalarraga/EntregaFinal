package AbstractaAcademy;

import org.openqa.selenium.By;
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
public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
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
	
	public WebElement myAccountLink() {
		return myAccountMenu;
	}

}