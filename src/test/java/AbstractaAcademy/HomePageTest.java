package AbstractaAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageTest {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abstracta 6\\Projects\\SeleniumCourse\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opencart.abstracta.us/");

		
		
		HomePage home = new HomePage(driver);
		home.myAccountLink().click();
	}

}
