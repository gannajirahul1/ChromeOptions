package ChromeOptions;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sslHandling {

	public static void main(String[] args) throws InterruptedException {
		//Handling SSL (secure socket layering)
		//it will provide a certificate ,with that we can access anything from the webpage
		
		
		ChromeOptions opt=new ChromeOptions();
		opt.setAcceptInsecureCerts(true);//when you enter false it will not accept into website
										  //when you enter trur it will accept to the website
		
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.quit();

	}

}
