package AbstractaAcademy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
/*
 * Esta pagina se usa para capturar el mensaje de que se haya creado exitosamente
 * el nuevo usuario.
 */
public class AccountSuccesPage {

	WebDriver driver;

	public AccountSuccesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using="//*[contains(h1,'Your Account Has Been Created!')]")
	private WebElement createdMessage; //aqui debo tomar el texto y compararlo
	
	@FindBy(how = How.XPATH, using = "//*[@class='pull-right']/a")
	private WebElement buttonContinue; //boton continuar cuando se crea un perfil
	
	
	String createdAccount = "Your Account Has Been Created!";
	
	//public void 
	
}
