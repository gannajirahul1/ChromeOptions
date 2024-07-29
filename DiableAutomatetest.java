package ChromeOptions;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DiableAutomatetest {

	public static void main(String[] args) throws InterruptedException {
		//  "Chrome is controlled by automated test software"
		//frm the below code you can remove the above caption while executing
		
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.quit();
		 

	}

}
