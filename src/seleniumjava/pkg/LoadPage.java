package seleniumjava.pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoadPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		//Close the tab
//		driver.close();
		EdgeDriver driver1 =new EdgeDriver();
		//open url
		driver1.get("https://www.google.com");
		driver1.close();
	}

}
