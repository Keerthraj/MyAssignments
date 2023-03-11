package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class LoadtheURL {

	public static void main(String[] args) {
//		//launch the browser
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//        ChromeDriver driver = new ChromeDriver(options);
//		//maximize the browser
//		driver.manage().window().maximize();
//		//Load the URL by get method
//		driver.get("https://www.facebook.com/");
//		//Close the browser window
//		driver.close();
		
		//launch the Edge browser
		EdgeDriver driver = new EdgeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//load the URL in browser
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.amazon.com/");
		//Close the window
		driver.close();
	
		

	}

}
