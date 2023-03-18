package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFacebook {

	public static void main(String[] args) {
		//Launch the chromebrowser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");		
		 ChromeDriver driver = new ChromeDriver(options);
		//Load the URL
		driver.get("https://en-gb.facebook.com/");
		//Maximise the window
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on Create New Account button
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]")).click();
		//Enter the first name
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Keerthana");
		//Enter the last name
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("R");
		//Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9002342135");
		//Enterthe password
		driver.findElement(By.xpath("//*[@id='password_step_input']")).sendKeys("Mar@2023");
		//Handle all the three drop downs
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		Select date = new Select(day);
		date.selectByIndex(19);
		//Month
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		Select month1 = new Select(month);
		month1.selectByValue("6");
		//year
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("1982");
		//Select the radio button "Female
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']/span[1]/input")).click();
		//Click on signup button
		 driver.findElement(By.xpath("//button[text()='Sign Up']")).click(); 
		 System.out.println("Facebook account created successfully");
	}

}
