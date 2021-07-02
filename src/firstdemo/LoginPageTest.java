package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\DESKTOP\\Automation\\New folder\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://evernote.com/");
		driver.findElement(By.xpath("/html/body/header/div[1]/div/nav[2]/ul/li[2]/a")).click();
		
		//will appear error message 
		//enter wrong email
		//driver.findElement(By.name("username")).sendKeys("esraasherief@gmail.com");
		
		driver.findElement(By.name("username")).sendKeys("esraa90021@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Esraa01003699317@");
		driver.findElement(By.id("loginButton")).click();
		
		
		
		
	}

}
