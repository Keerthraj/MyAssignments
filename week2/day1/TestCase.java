package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 ChromeDriver driver = new ChromeDriver(options);
		
//		EdgeDriver driver = new EdgeDriver();
		//Load the URL
		 driver.get("http://leaftaps.com/opentaps");
		 //Maximize the browser
		 driver.manage().window().maximize();
		 //Enter username as DemoCSR
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
		 //Enter the Password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 //Click on Login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //Click on CRM/SFA
		 driver.findElement(By.partialLinkText("CRM")).click();
//		//Enter username as DemoCSR
//		 driver.findElement(By.name("USERNAME")).sendKeys("DemoCSR");
//		 //Enter the Password
//		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
//		//Click on Login
//		 driver.findElement(By.className("loginButton")).click();
//		 Thread.sleep(3000);
		 //Click on Leads
		 driver.findElement(By.linkText("Leads")).click();
		// driver.findElement(By.xpath("//*[@id='ext-gen534']")).click();
		 //Click on CreateLead  Link
		 driver.findElement(By.linkText("Create Lead")).click();
		 //Enter the Companyname
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		 //Enter the Firstname 
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Keerthana");
		 //Enter the Lastname
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendrababu");
		 //Click Creat Lead
		 driver.findElement(By.name("submitButton")).click();
		 

	}

}
