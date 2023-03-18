package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead {

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
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
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
		//Enter first name
		driver.findElement(By.xpath("(//div[contains(@class,'x-form-element')]/input[@name='firstName'])[3]")).sendKeys("jeeva");
		//Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//Click on first resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		//Verify title of the page
		String title = driver.getTitle(); 
		System.out.println(title);
		if(title.equals("View Lead | opentaps CRM")) 
			
		//Click Edit
		driver.findElement(By.linkText("Edit")).click();
		//Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Amazon");
		//Click Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//Close the browser (Do not log out)
		driver.close();
		
	}

}
