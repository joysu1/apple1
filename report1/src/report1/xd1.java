package report1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xd1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROG-STRIX\\OneDrive\\Documents\\Desktop\\slenium web driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com");
		
	  Thread.sleep(3000);
       driver.navigate().to("https://www.myntra.com");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
	}

}
