package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		 //Launch the chromebrowser
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");		
		 ChromeDriver driver = new ChromeDriver(options);
		 //Launch URL "http://leaftaps.com/opentaps/control/login"
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 //maximize the broswer
		 driver.manage().window().maximize();
		 //Add implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 // Enter UserName and Password Using Id Locator
		 driver.findElement(By.xpath("//*[@id='username']")).sendKeys("DemoCSR");
		 driver.findElement(By.xpath("//*[@id='password']")).sendKeys("crmsfa");
		 //Click on Login Button using Class Locator
		 driver.findElement(By.xpath("//*[@class='decorativeSubmit']")).click();
		 //Click on CRM/SFA Link
		 driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		 //Click on contacts Button
		 driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		 //Click on Create Contact
		 driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		 //Enter FirstName Field Using id Locator
		 driver.findElement(By.xpath("//*[@id='firstNameField']")).sendKeys("Keerthana");
		 //Enter LastName Field Using id Locator
		 driver.findElement(By.xpath("//*[@id='lastNameField']")).sendKeys("R");
		 //Enter FirstName(Local) Field Using id Locator
		 driver.findElement(By.xpath("//*[@id='createContactForm_firstNameLocal']")).sendKeys("Mithul");
		 //Enter LastName(Local) Field Using id Locator
		 driver.findElement(By.xpath("//*[@id='createContactForm_lastNameLocal']")).sendKeys("K");
		 //Enter Department Field Using any Locator of Your Choice
		 driver.findElement(By.xpath("//*[@name='departmentName']")).sendKeys("IT");
		 //Enter Description Field Using any Locator of your choice
		 driver.findElement(By.xpath("//*[@name='description']")).sendKeys("Testing");
		 //Enter your email in the E-mail address Field using the locator of your choice
		 driver.findElement(By.xpath("//*[@id='createContactForm_primaryEmail']")).sendKeys("keerthana@gmail.com");
		 //Select State/Province as NewYork Using Visible Text
		 WebElement state = driver.findElement(By.xpath("//*[@id='createContactForm_generalStateProvinceGeoId']"));
		 Select dropdown = new Select(state);
		 dropdown.selectByVisibleText("New York");
		 //Click on Create Contact
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
		 //Click on edit button 
		 driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[contains(text(),'Edit')]")).click();
		 //Clear the Description Field using .clear
		 driver.findElement(By.xpath("//*[@name='description']")).clear();
		 //Fill ImportantNote Field with Any text
		 driver.findElement(By.xpath("//*[@id='updateContactForm_importantNote']")).sendKeys("Done");
		 //Click on update button using Xpath locator
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 //Get the Title of Resulting Page
		 String title = driver.getTitle();
		 System.out.println(title);
		
	}
	
	
	
	

}
