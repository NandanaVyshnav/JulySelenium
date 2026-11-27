package seleniumjava.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Page {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//To check current url 
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.google.com")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//Title verification
		String actualTitle = driver.getTitle();
		if(actualTitle.equals("Google")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//Text Contains
		String src = driver.getPageSource();
		if(src.contains("About")) {
			System.out.println("Text Contains");
		}
		else {
			System.out.println("Text Not Found");
		}
		
	}

}
