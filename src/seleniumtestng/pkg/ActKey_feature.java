package seleniumtestng.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActKey_feature {
	@BeforeMethod
	public void pageLoad() {
		driver.get(url);
		driver.manage().window.maximize();
		
	}
	@Test
	public void kebordEvent() {
		WebElement fullnmae = driver.findElement(By.xpath("html/body/div[2]/div[2]/form"));
		fullname.sendKeys("Arun");
		WebElement id = driver.findElement(By.xpath("//form[@name='register_mail']/div/div"));
		
		Actions act = new Action(driver);
		
		//select -> ctrl + a
		act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		
		//copy -> crtl+c
		act.
	}

}
