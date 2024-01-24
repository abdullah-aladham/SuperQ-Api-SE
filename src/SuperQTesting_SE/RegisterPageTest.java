package SuperQTesting_SE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;
//import org.testng.annotations.Test;


public class RegisterPageTest {

	WebDriver driver = new ChromeDriver();

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver-win64//chromedriver-win64//chromedriver.exe");

		driver.manage().window().maximize();	
	}
	@Test(groups="g1")
	public void title() {
		driver.get("http://www.superquality.me//Account/Login?ReturnUrl=%2FBackend");
	}
	public void ending() {
		driver.close();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
