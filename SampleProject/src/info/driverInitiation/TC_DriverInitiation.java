package info.driverInitiation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_DriverInitiation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium pjt\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.facebook.com");
		driver.close();

	}

}
