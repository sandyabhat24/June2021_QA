import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandh\\june2021-Selenium\\1st_selenium_project\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		//driver.findElement(By.name("btnk") ).click();
		Thread.sleep(3000);
		driver.close();
	} 

}