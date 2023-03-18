package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		//Launch the chromebrowser
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");		
				 ChromeDriver driver = new ChromeDriver(options);
				//Load the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				//Maximise the window
				driver.manage().window().maximize();
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Enter the username
				driver.findElement(By.id("username")).sendKeys("demosalesManager");
				//Enter the password
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				//Click Login
				driver.findElement(By.className("decorativeSubmit")).click();
				//Click crm/sfa link
				driver.findElement(By.partialLinkText("CRM")).click();
				//Click Leads link
				driver.findElement(By.partialLinkText("Leads")).click();
				//Click Find leads
				driver.findElement(By.partialLinkText("Find Leads")).click();
				//Click on Phone
				driver.findElement(By.partialLinkText("Phone")).click();
				//Enter Country Code
				//driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
				//Enter Area Code
				//driver.findElement(By.name("phoneAreaCode")).sendKeys("44");
				//Enter Phone Number
				driver.findElement(By.name("phoneNumber")).sendKeys("12345");
				//Click find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(2000);
				//Capture lead ID of First Resulting lead
				String id = driver.findElement(By.xpath("//div[@class='x-grid3-scroller']/div/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div/a")).getText();
				//Click First Resulting lead
				driver.findElement(By.xpath("//div[@class='x-grid3-scroller']/div/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div/a")).click();
				//Click Delete
				driver.findElement(By.className("subMenuButtonDangerous")).click();
				//Click Find leads
				driver.findElement(By.partialLinkText("Find Leads")).click();
				//Enter captured lead ID
				driver.findElement(By.xpath("//div[contains(@class,'x-form-element')]/input[@name='id']")).sendKeys(id);
				//Click find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
				WebElement message = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']/div[1]"));
				String text = message.getText();
				System.out.println("Verified the message displayed as"+ text);
				driver.close();
					
				
				
				
	
	}}
	


