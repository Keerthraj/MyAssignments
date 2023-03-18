package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DuplicateLead {

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
		//Click on Email
		driver.findElement(By.partialLinkText("Email")).click();
		//Enter Email
		driver.findElement(By.xpath("(//label[text()='Email Address:']/following::input)[1]")).sendKeys("testleaf@gmail.com");
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//Capture name of First Resulting lead
		WebElement first = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")); 
		String name=first.getText(); 
        System.out.println(name); 
		Thread.sleep(2000);
		//Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
		//Click Duplicate Lead
		driver.findElement(By.partialLinkText("Duplicate Lead")).click();
		//Verify the title as 'Duplicate Lead'
		WebElement duplicate = driver.findElement(By.id("sectionHeaderTitle_leads"));
		String text = duplicate.getText();
		System.out.println("Verifying the title as"+ text);
		//Click Create Lead
		driver.findElement(By.name("submitButton")).click();
		//Confirm the duplicated lead name is same as captured name
		WebElement firstname = driver.findElement(By.id("viewLead_firstName_sp"));
		String name1 = firstname.getText();
		//comparing string name is equal to first name
		if(name1.equals(name)) 
   	 {
   		 System.out.println("Duplicated");
   	 } 
   	 driver.close();
   		 
    }
		
		
		

	}


