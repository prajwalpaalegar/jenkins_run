package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_login_script {
@Test
public void test_jenkins_script()
{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys("helllo");
	driver.findElement(By.id("pass")).sendKeys("Hey");
	driver.findElement(By.name("login")).click();
	driver.close();
}
}
