package report1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kp2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ROG-STRIX\\OneDrive\\Documents\\Desktop\\slenium web driver\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://justdial.com/");
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		
		//Thread.sleep(1000);
		//driver.manage().window().minimize();
		
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
	}

}
