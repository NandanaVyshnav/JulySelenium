package seleniumjunit;
import org.junit.Test;
import org.junit.Before;
//import java.time.Duration;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
  private WebDriver driver;

  @Before
  public void setUp() {
   driver = new FirefoxDriver();

  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void googleSearch() {
    driver.get("https://www.google.com/?zx=1794810868743");
    driver.manage().window().setSize(new Dimension(1280, 672));
 //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("Books");
    driver.findElement(By.name("btnK")).click();
 
    //driver.close();
  }
}
