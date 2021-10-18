import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Punam\\Desktop\\Selenium\\Chromedrivernewnew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
