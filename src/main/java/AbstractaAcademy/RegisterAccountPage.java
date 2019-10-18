package AbstractaAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * Esta pagina se usa para registrar a los nuevos usuarios, podria ver si puedo
 * mandar el dataFile con esta misma page.
 */
public class RegisterAccountPage {

	WebDriver driver;

	public RegisterAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	By firstName = By.cssSelector("#input-firstname");
	By lastName = By.cssSelector("#input-lastname");
	By email = By.cssSelector("#input-email");
	By telephone = By.cssSelector("#input-telephone");
	By company = By.cssSelector("#input-company");
	By address = By.cssSelector("#input-address-1");
	By city = By.cssSelector("#input-city");
	By postCode = By.cssSelector("#input-postcode");
	By country = By.cssSelector("#input-country"); //este es un select
	By zone = By.cssSelector("#input-zone"); //este es un select
	By password = By.cssSelector("#input-password");
	By passwordConfirm = By.cssSelector("#input-confirm");
	By checkAgree = By.xpath("//input[@name='agree']");
	By buttonContinue = By.xpath("//*[@value='Continue']");
	
}
