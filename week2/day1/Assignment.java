package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	
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
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
		 //Enter the Password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 //Click on Login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //Click on CRM/SFA
		 driver.findElement(By.partialLinkText("CRM")).click();
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
		 //Enter FirstName(Local) Field Using id Locator
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mithul");
		 //Enter Department Field Using any Locator of Your Choice
		 driver.findElement(By.name("departmentName")).sendKeys("IT");
		 //Enter Description Field Using any Locator of your choice 
		 driver.findElement(By.className("inputBox")).sendKeys("Testing");
		 //Enter your email in the E-mail address Field using the locator of your choice
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("keerthana@gmail.com");
		// Select State/Province as NewYork Using Visible Text
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		//Dropdown is inside the select tag . Hence declaring the below code
		 Select dropdown = new Select(state);
		 dropdown.selectByVisibleText("New York");
		 //Click on Create Button
		 driver.findElement(By.name("submitButton")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		
		
		
	}

}
