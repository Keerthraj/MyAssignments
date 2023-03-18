package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafGoundAssignment {

	public static void main(String[] args) {
		//Your most favorite browser
		//Launch the chromebrowser
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");		
				 ChromeDriver driver = new ChromeDriver(options);
				//Load the URL
				driver.get("https://www.leafground.com/radio.xhtml");
				//Maximise the window
				driver.manage().window().maximize();
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Your most favorite browser
				driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]")).click();
				//UnSelectable
				driver.findElement(By.xpath("//*[@id='j_idt87:city2']/div/div[1]/div/div[2]")).click();
				//Find the default select radio button
				driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]")).click();
				//Select the age group (only if not selected)
				driver.findElement(By.xpath("//div[@id='j_idt87:age']/div[1]/div[2]/div[1]/div[2]/span[1]")).click();
				System.out.println("Completed");
				//close the window  
				driver.close();
				 

	}

}
