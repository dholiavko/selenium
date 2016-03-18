package jar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTraining {

	public static void main(String[] args) throws Exception {

		WebDriver FFdriver = new FirefoxDriver(); 
		FFdriver.navigate().to("http://yahoo.com"); 
//		Thread.sleep(2000); 
//		FFdriver.close();

	}

}
