package ChromeOptions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExtensionsAtRuntime {

	public static void main(String[] args) throws InterruptedException {
		// 
		/*   
		  1)go to web store search crx extractor/downlaoder
		  2)add to chrome (manually)
		  3)add selectorhub plugin to chrome browser
		  4)capture crx file for uBlock origin
		  5)pass the crx file path in automation scripts in chrome options
		 */
		
		
		ChromeOptions opt=new ChromeOptions();
		File file =new File("C:\\Users\\GANNAJI RAHUL\\OneDrive\\Desktop\\software testing\\crx files\\selectorhub.crx");
		
		opt.addExtensions(file);
		
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.quit();
		
	}

}
