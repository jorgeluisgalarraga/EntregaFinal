package AbstractaAcademy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HomePageTest {

	@Test
	public void Login() {
		// property en Abstracta
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\abstracta
		// 6\\Projects\\SeleniumCourse\\drivers\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prueba\\Desktop\\SeleniumJava\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://opencart.abstracta.us/");

		BasePage home = new BasePage(driver);
		home.clickOnMyAccountMenu();
		Assert.assertTrue(home.registerLinkText().equalsIgnoreCase("Register"));
		home.clickOnRegisterLink();
		
		//lo agregue para probar
		boolean displayed = home.logo().isDisplayed();
		Assert.assertTrue(displayed);

		RegisterAccountPage registerPage = new RegisterAccountPage(driver);

		Assert.assertEquals("Register Account", registerPage.getTitlePage());
		
		registerPage.setFirstName("Jorge");
		registerPage.setLastName("Galarraga");
		registerPage.setEmail("jorge00003@example.com");
		registerPage.setTelephone("123456789");
		registerPage.setCompany("Abstracta");
		registerPage.setAddress("Calle 1, piso 2");
		registerPage.setCity("Santiago");
		registerPage.setPostCode("1234");
		registerPage.selectCountry("Chile");
		registerPage.selectZone("Region Metropolitana");
		registerPage.setPassword("1234");
		registerPage.setPasswordConfirm("1234");
		registerPage.clickOnAgreeTerm();
		registerPage.clickOnContinueButton();
		
		AccountSuccessPage successPage = new AccountSuccessPage(driver);
		
		Assert.assertEquals(successPage.createdAccountMessage(), successPage.getCreatedMessage());
		successPage.clickOnContinueButton();
		home.clickOnMyAccountMenu();
		home.clickOnLogoutLink();
		
		home.clickOnMyAccountMenu();
		Assert.assertTrue(home.registerLinkText().equalsIgnoreCase("Register"));
		
		
		
		

	}

}
