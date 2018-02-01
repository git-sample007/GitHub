package test.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class AppTest {
   
	@Test
	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\pvarma\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		
			String baseURL = "https://i-nspires-alpha.nasaprs.com/internal/index.faces";
			
			driver.get(baseURL);
			
	}
	
	
	
}
