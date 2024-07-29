package ChromeOptions;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingIncognito {

	public static void main(String[] args) throws InterruptedException {
		// opening website in incognito page and disabling the automated test

		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.quit();
	}

}
