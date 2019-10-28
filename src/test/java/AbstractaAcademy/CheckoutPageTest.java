package AbstractaAcademy;


import org.testng.annotations.Test;

import AbstractaAcademy.BaseTest;
import junit.framework.Assert;

public class CheckoutPageTest extends BaseTest {

	@Test
	public void login(){
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		CartPage cart = new CartPage(driver);
		CheckoutPage checkout = new CheckoutPage(driver);

		
		basePage.clickOnMyAccountMenu();
		basePage.clickOnLogin();

		login.setEmailLogin("jorge00001@example.com");
		login.setPasswordLogin("1234");
		login.clickOnLoginButton();

		basePage.clickOnMyAccountMenu();
		basePage.clickOnLogo();

		/*
		 * hasta aqui no sirve este flujo. no puedo validar si los elementos estan
		 * presentes ni nada mañana debo ver de agregar la mac e ir al carrito sin hacer
		 * ningun assertion por ahora
		 */

		// Assert.assertEquals("MacBook", home.macBookProductText());
		// basePage.setSearchProduct("MacBook");
		// basePage.clickOnSearchButton();
		
		home.clickOnAddButtonMacBook();
		
		Assert.assertEquals(true, home.alertMacBookIsPresent());

		// home.webElementIsPresent(home.getMacBookAlert());

		Assert.assertEquals(true, home.webElementIsPresent(home.getCartAlert()));
		// home.webElementIsPresent(home.getCartAlert());
		home.clickOnShoppingCartAlert();

		System.out.println("se agrego la mac");
		// Assert.assertEquals(driver.getCurrentUrl(), cart.getUrl());
		Assert.assertEquals("http://opencart.abstracta.us/index.php?route=checkout/cart", cart.getUrl());

		Assert.assertEquals(cart.getCostProduct(), cart.getTotalCostProduct());

		cart.clickOnContinueButton();
		
		checkout.clickOnContinuePayment();
		
		checkout.setCommentsToOrder("Prueba de pago, deberia devolver un mensaje de error");
		
		//Validar que este este mensaje presente: Warning: No Payment options are available. 
		//Please contact us for assistance!
		
		checkout.clickOnTermsConditions();
		
		checkout.clickOnContinueMethod();
		
		//validar mensaje presente
		//Capturar la alerta de Warning: Payment method required!
		//×
		
		checkout.clickOnMyAccountMenu();
		checkout.clickOnLogoutLink();
		checkout.clickOnMyAccountMenu();

		

	}

}
