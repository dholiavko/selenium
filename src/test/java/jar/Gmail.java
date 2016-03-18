package jar;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) throws Exception {

		WebDriver Gmail = new FirefoxDriver(); 
		Gmail.navigate().to("http://gmail.com");
//		Gmail.navigate().to("http://yahoo.com");
		Gmail.manage().window().setPosition(new Point(1100, 0));
		Gmail.manage().window().setSize(new Dimension(820, 1162)); 
		Thread.sleep(3000);
		
		String Login = "dholiavko@exadel.com"; 
		Gmail.findElement(By.id("Email")).sendKeys(Login); 
		Gmail.findElement(By.id("next")).click(); 
		Thread.sleep(3000);

		Gmail.findElement(By.id("Passwd")).sendKeys("Password");
		Gmail.findElement(By.id("signIn")).click();
		
		String mainPageActual = Gmail.getCurrentUrl(); 
		System.out.println(mainPageActual);
		String mainPageTested = "https://mail.google.com/mail/u/0/"; 
		
		if (mainPageTested.equals(mainPageActual)) {
			System.out.println("Test passed");}
			else
				System.out.println("Test failed");
		}
				
	}


