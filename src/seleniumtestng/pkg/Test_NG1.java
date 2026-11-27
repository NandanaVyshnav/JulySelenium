package seleniumtestng.pkg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;


public class Test_NG1 {
	@BeforeTest
	public void browsersetUp() {
		System.out.println("Browser loading...");
	}
	
	@BeforeMethod
	public void urlSetUp(){
		System.out.println("Page Loading...");
	}
	
	@Test
	public void urlVerification(){
		System.out.println("Current url");
		
	}
	
	@Test
	public void titleVerification() {
		System.out.println("Check Title");
	}
	
	@Test 
	public void pageScreenshot() {
		System.out.println("Page Screenshot.");
	}
	
	@Test
	public void brokenLinks() {
		System.out.println("Link Details");
	}
	
	@Test
	public void alertHandling() {
		System.out.println("Alert Handling");
	}
	
	@Test
	public void pageSource() {
		System.out.println("Text Conatins");
	}
	@AfterMethod
	public void tabClose() {
		System.out.println("Close Browser.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	}
}
