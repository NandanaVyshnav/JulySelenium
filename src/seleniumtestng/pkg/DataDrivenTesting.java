package seleniumtestng.pkg;

import org.testng.annotations.BeforeTest;

public class DataDrivenTesting {
	
	@BeforeTest
	public void envSetup() {
		driver =new ChromeDriver();
	}

	@BeforeMethod
	public void loadUrl() {
		driver.get("https://www.facebook.com");
		driver.manage
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
