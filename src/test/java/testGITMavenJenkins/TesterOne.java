package testGITMavenJenkins;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TesterOne {

	@Test
	public void method1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement elements = driver.findElement(By.id("Skills"));
		Select dropdown = new Select(elements);
		//dropdown.selectByIndex(1);
		//dropdown.selectByValue("Analytics");
		//dropdown.selectByVisibleText("Select Skills");
		
		
		//get all values
		List<String> dropValues = new ArrayList<String>();
		List<WebElement> list = dropdown.getOptions();
		
		for(WebElement obj:list)
		{
			dropValues.add(obj.getText());
		}
		System.out.println(dropValues);
		
		driver.close();
	}

}
