package seleniumjunit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google_Page {
	WebDriver driver;
	@Before
	public void envSetUp() {
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com");
	}
	
	@Test
	public void TitleVerification() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "google";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	}
	
	@Test
	public void CurrentUrl(){
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "hhtps://www.google.com";
		if(actualurl.equals(expectedurl)) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	}
	
	@Test
	public void textContains() {
		String src = driver.getPageSource();
		if(src.contains("About")) {
			System.out.println("PASS : Text Contains");
		}
		else {
			System.out.println("FAIL : Text Contains");
		}
	}

	@After
	public void browserClose() {
		 
	}
}
