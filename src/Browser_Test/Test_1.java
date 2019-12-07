package Browser_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "‪E:\\chromedriver_win32\\chromedriver.exe");	
   WebDriver driver= new ChromeDriver();
	
		driver.get("http://facebook.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}

	

}
