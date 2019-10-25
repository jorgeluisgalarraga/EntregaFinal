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
	
	
	@Test
	public void login() throws InterruptedException {
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
		
		
		/*
		 * hasta aqui no sirve este flujo. no puedo validar si los elementos estan presentes ni nada
		 * mañana debo ver de agregar la mac e ir al carrito sin hacer ningun assertion por ahora
		 */
		//wait.until(ExpectedConditions.elementToBeClickable(home.prueba()));
		//Assert.assertEquals("MacBook", home.macBookProductText());
		//basePage.setSearchProduct("MacBook");
		//basePage.clickOnSearchButton();
		//Thread.sleep(3000);
		home.clickOnAddButtonMacBook();
		//Thread.sleep(3000);
		Assert.assertEquals(true, home.alertMacBookIsPresent());
		
		//home.webElementIsPresent(home.getMacBookAlert());
		
		
		Assert.assertEquals(true, home.webElementIsPresent(home.getCartAlert()));
		//home.webElementIsPresent(home.getCartAlert());
		home.clickOnShoppingCartAlert();
		
		System.out.println("se agrego la mac");
		//Assert.assertEquals(driver.getCurrentUrl(), cart.getUrl());
		//Thread.sleep(10000);
		Assert.assertEquals("http://opencart.abstracta.us/index.php?route=checkout/cart", cart.getUrl());
		
		Assert.assertEquals(cart.getCostProduct(), cart.getTotalCostProduct());
		//Thread.sleep(10000);
		cart.clickOnContinueButton();
		
		
		
							 
		
		
		
		
		
		
	}
	

}
