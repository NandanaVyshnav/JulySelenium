package seleniumjunit;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.logging.FileHandler;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_Project {
	
	WebDriver driver;
	String url = "https://www.amazon.in/";
	
	@Before
	public void EnvSetup() throws InterruptedException{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
	}
	
	@Test
	public void amazonAutomation() throws InterruptedException{
		
		//1.Open Amazon
		System.out.println("Home Page Title : "+driver.getTitle());
		System.out.println("Current URL :"+driver.getCurrentUrl());
		
		//2.Search Mobile 
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("mobiles");
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

        String title = driver.getTitle();

        System.out.println(" Search Page Title: " + title);

        if (title.toLowerCase().contains("mobiles")) {
            System.out.println(" Title contains mobiles");
        } else {
            System.out.println("FAIL - Title does not contain mobiles");
        }
     //TC04 Hello sign in
        driver.findElement(By.id("nav-link-accountList")).click();

        // TC05, TC06: Invalid email and button status
        driver.findElement(By.id("ap_email_login")).sendKeys("invalidemail");
        driver.findElement(By.id("continue")).click();

        Thread.sleep(1000);
        WebElement button=driver.findElement(By.id("continue"));

        if (button.isEnabled()) {
            System.out.println(" PASS - Continue button is enabled");
        } 
        else {
            System.out.println(" FAIL - Continue button is disabled");
        }

    

        // TC07 Navigate back
        driver.navigate().back();
        driver.navigate().back();

        Thread.sleep(1000);


        //TC08 Click Today's Deals
         Thread.sleep(1000); 
	    
	    //TC09 Locates the link using the provided XPath and clicks it
	    WebElement ele = driver.findElement(By.xpath("//*[@id='nav-xshop']/ul/li[4]/div/a"));
	    ele.click();


        //TC10  Find and click Hamper menu
       driver.findElement(By.id("nav-hamburger-menu")).click();
      

        //TC11  Find broken links
       List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : "+li.size());
		
		for(WebElement data : li) {
			String links = data.getAttribute("href");
			String linktext = data.getText();
			System.out.println(linktext +" \t"+links);
			
			verify(links);//method name. function with parameter
		}
	}

	 public void verify(String u) throws IOException {
		try { 
		      URL ul = new URL(u);
		      HttpURLConnection con = (HttpURLConnection) ul.openConnection();
		      con.setConnectTimeout(3000);
		      con.connect();
		 
		      if(con.getResponseCode()==200) {
		    	  System.out.println("Valid = "+u);
		      }
		      else {
		    	  System.out.println("Invalid = "+u);
		      }
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		
		//TC12 Contains Text
		 String page = driver.getPageSource();

	        if (page.contains("Customer Service")) {
	            System.out.println("PASS: Page contains Customer Service");
	        }
	        else {
	            System.out.println("FAIL: Text not found");
	        }
		
       
       //TC13 Current url
        String url = driver.getCurrentUrl();

        System.out.println("Current URL: " + url);

        
        //TC14 Full-page screenshot

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D://Automation//ScreensSot/Page1.png"));
		
		

        //TC15  Element screenshot
		WebElement ele1=driver.findElement(By.id("twotabsearchtextbox"));
		File src1=ele1.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("D://Automation//ScreensSot/Element1.png"));
    }

}
 
