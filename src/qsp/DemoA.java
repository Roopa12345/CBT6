package qsp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoA {
	
@Test
public void testA() throws MalformedURLException
{
	/*URL r=new URL("http://localhost:4444/wb/hib");
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setBrowserName("chrome");
	WebDriver driver=new RemoteWebDriver(r, cap);
	driver.quit();*/
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.quit();
}
}
