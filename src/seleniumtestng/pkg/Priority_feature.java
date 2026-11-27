package seleniumtestng.pkg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority_feature {
	
	//Priority - -ve 0,+ve
	
	@BeforeTest
	public void browsersetUp() {
		System.out.println("Browser is Loading..");
	}
	
	@BeforeMethod
	public void urlsetUp() {
		System.out.println("Page Loading...");
	}
	
	@Test
	public void urlVerification() {
		System.out.println("");
	}

}
