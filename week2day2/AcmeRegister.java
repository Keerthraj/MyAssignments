package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AcmeRegister {

	public static void main(String[] args) {
		//Launch the chromebrowser
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");		
				 ChromeDriver driver = new ChromeDriver(options);
				//Load the URL
				driver.get("https://acme-test.uipath.com/login");
				//Maximise the window
				driver.manage().window().maximize();
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Enter email as "kumar.testleaf@gmail.com"
				driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
				//Enter Password as "leaf@12"
				driver.findElement(By.id("password")).sendKeys("leaf@12");
				//Click login button
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				//Get the title of the page and print
				String title1 = driver.getTitle();
				System.out.println(title1);
				//Click on Log Out
				driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[3]/a")).click();
				//Close the browser (use -driver.close())
				driver.close();
	}

}
