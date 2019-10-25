package AbstractaAcademy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;

	@BeforeTest
	public void setUp() {
		//property en casa
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\prueba\\Desktop\\SeleniumJava\\drivers\\chromedriver.exe");

		// property en Abstracta
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abstracta 6\\Projects\\SeleniumCourse\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://opencart.abstracta.us/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
