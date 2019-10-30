package AbstractaAcademy;


import org.testng.annotations.Test;

import AbstractaAcademy.BaseTest;
import junit.framework.Assert;

public class BuyingAsRegisterUserTest extends BaseTest {

	@Test
	public void login(){
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
		CartPage cartPage = new CartPage(driver);
		CheckoutPage checkoutPage = new CheckoutPage(driver);

		
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

		Assert.assertEquals("MacBook", home.macBookProductText());
		// basePage.setSearchProduct("MacBook");
		// basePage.clickOnSearchButton();
		
		home.clickOnAddButtonMacBook();
		
		//cierta redundancia aqui y el assert de abajo Assert.assertTrue(home.alertMacBookIsPresent());
		


		Assert.assertEquals(true, home.webElementIsPresent(home.getCartAlert()));
		// home.webElementIsPresent(home.getCartAlert());
		home.clickOnShoppingCartAlert();

		Assert.assertEquals(driver.getCurrentUrl(), cartPage.getUrl());
		//Assert.assertEquals("http://opencart.abstracta.us/index.php?route=checkout/cart", cartPage.getUrl());

		Assert.assertEquals(cartPage.getCostProduct(), cartPage.getTotalCostProduct());

		cartPage.clickOnContinueButton();
		
		checkoutPage.clickOnContinuePayment();
		
		Assert.assertTrue(checkoutPage.alertPaymentIsPresent());
		
		checkoutPage.setCommentsToOrder("Prueba de pago, deberia devolver un mensaje de error");
		
		//Validar que este este mensaje presente: Warning: No Payment options are available. 
		//Please contact us for assistance!
		
		checkoutPage.clickOnTermsConditions();
		
		checkoutPage.clickOnContinueMethod();
		
		
		//validar mensaje presente
		Assert.assertTrue(checkoutPage.alertMethodIsPresent());
		
		checkoutPage.clickOnMyAccountMenu();
		checkoutPage.clickOnLogoutLink();
		
		checkoutPage.clickOnMyAccountMenu();
		Assert.assertTrue(home.registerLinkText().equalsIgnoreCase("Register"));

		

	}

}
