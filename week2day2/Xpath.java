package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {

	public static void main(String[] args) {
		//Launch the Browser 
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				 ChromeDriver driver = new ChromeDriver(options);
				//Load the URL
				 driver.get("http://leaftaps.com/opentaps");
				 //Maximize the browser
				 driver.manage().window().maximize();
				 //Enter username as DemoCSR
				 driver.findElement(By.xpath("//*[@id='username']")).sendKeys("DemoCSR");
				 //Enter the Password
				 driver.findElement(By.xpath("//*[@id='password']")).sendKeys("crmsfa");
				 //Click on Login
				 driver.findElement(By.xpath("//*[@id='login']/p[3]/input")).click();
				 //Click on CRM/SFA
				 driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
				//Enter username as DemoCSR
//				 driver.findElement(By.xpath("(//input[@type = 'text'])[1]")).sendKeys("DemoCSR");
//				 //Enter the Password
//				 driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("crmsfa");
//				//Click on Login
//				 driver.findElement(By.xpath("//input[@value= 'Login']")).click();
				// Click on Leads
				 driver.findElement(By.xpath("//a[text()='Leads']")).click();
				//Click on CreateLead  Link
				 driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
				 //Enter the Companyname
				 driver.findElement(By.xpath("//*[@id='createLeadForm_companyName']")).sendKeys("Cognizant");
				 //Enter the Firstname 
				 driver.findElement(By.xpath("//*[@id='createLeadForm_firstName']")).sendKeys("Keerthana");
				 //Enter the Lastname
				 driver.findElement(By.xpath("//*[@id='createLeadForm_lastName']")).sendKeys("Rajendrababu");
				 //Click Creat Lead
				 driver.findElement(By.xpath("//*[@class='smallSubmit']")).click();
				
	}

}
