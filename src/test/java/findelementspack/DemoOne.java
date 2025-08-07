package findelementspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOne {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
		
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		
		driver.quit();

	}

}
