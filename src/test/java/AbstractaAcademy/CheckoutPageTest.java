package AbstractaAcademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AbstractaAcademy.BaseTest;
import junit.framework.Assert;

public class CheckoutPageTest extends BaseTest {
	
	/*
	 * @BeforeTest public void setUp() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\prueba\\Desktop\\SeleniumJava\\drivers\\chromedriver.exe");
	 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.manage().deleteAllCookies();
	 * driver.get("http://opencart.abstracta.us/");
	 
		
	}*/
	//BasePage basePage = new BasePage(driver);
	/*HomePage home = new HomePage(driver);
	LoginPage login = new LoginPage(driver);
	CartPage cart = new CartPage(driver);
	CheckoutPage checkout = new CheckoutPage(driver);*/
	
	
	@Test
	public void login() {
		BasePage basePage = new BasePage(driver);
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		CartPage cart = new CartPage(driver);
		CheckoutPage checkout = new CheckoutPage(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		basePage.clickOnMyAccountMenu();
		basePage.clickOnLogin();
		
		login.setEmailLogin("jorge00001@example.com");
		login.setPasswordLogin("1234");
		login.clickOnLoginButton();
		
		basePage.clickOnMyAccountMenu();
		basePage.clickOnLogo();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		/*
		 * hasta aqui no sirve este flujo. no puedo validar si los elementos estan presentes ni nada
		 * mañana debo ver de agregar la mac e ir al carrito sin hacer ningun assertion por ahora
		 */
		wait.until(ExpectedConditions.elementToBeClickable(home.prueba()));
		//Assert.assertEquals("MacBook", home.macBookProductText());
		home.clickOnAddButtonMacBook();
		
		Assert.assertEquals(true, home.alertMacBookIsPresent());
		home.clickOnShoppingCartAlert();
		
		
		
		
		
		
		
	}
	

}
