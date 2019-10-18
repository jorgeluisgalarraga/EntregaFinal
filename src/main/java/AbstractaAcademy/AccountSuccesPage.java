package AbstractaAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
 * Esta pagina se usa para capturar el mensaje de que se haya creado exitosamente
 * el nuevo usuario.
 */
public class AccountSuccesPage {

	WebDriver driver;

	public AccountSuccesPage(WebDriver driver) {
		this.driver = driver;
	}

	By createdMessage = By.xpath("//*[contains(h1,'Your Account Has Been Created!')]"); //aqui debo tomar el texto y compararlo
	By buttonContinue = By.xpath("//*[@class='pull-right']/a"); //boton continuar cuando se crea un perfil
	
	String createdAccount = "Your Account Has Been Created!";
	
}
