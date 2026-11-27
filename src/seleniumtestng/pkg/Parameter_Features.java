package seleniumtestng.pkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameter_Features {
	@Parameters({"V"})
	@Test
	public void parameterTest(String vi) {
		System.out.println("vi");
	}

}
