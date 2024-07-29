package ChromeOptions;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) throws InterruptedException {
		/* headless testing: with this we can get result without performing UI ...like we get the result pass or fail
		  -->the test will run backend
		  Advantages
		  --------------
		  1)We can do Multiple tasks (we can do parallel tasks)
		  2)faster execution
		  Disadvantages
		  --------------
		  1)user can't see the actions on the page.so he can't understand the flow/functionality of the test
		  ( it is for freshers) 
		  2)at the time of developing dont use
		  3)once you completed automation scripts then you can use
		  
		  */
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless=new");
		
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.nopcommerce.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.quit();

	}

}
