package AbstractaAcademy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/*
 * Esta pagina se usa para capturar el mensaje de que se haya creado exitosamente
 * el nuevo usuario.
 */
public class AccountSuccessPage extends BasePage {

	public AccountSuccessPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using="//*[@id='content'] //h1")
	private WebElement createdMessage; //aqui debo tomar el texto y compararlo
	
	@FindBy(how = How.XPATH, using = "//*[@class='pull-right']/a")
	private WebElement buttonContinue; //boton continuar cuando se crea un perfil
	
	
	String createdAccount = "Your Account Has Been Created!";
	

	
	public String getCreatedMessage () {
		return createdMessage.getText();
	}
	
	public void clickOnContinueButton() {
		buttonContinue.click();
	}
	
	public String createdAccountMessage() {
		return createdAccount;
	}
	
}
