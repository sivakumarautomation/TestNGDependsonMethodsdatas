package login; //package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signin { //class//
	
	public WebDriver odriver;

	@Test(priority = 1)
	void OpenUrl() {
		odriver = new ChromeDriver();
		odriver.get("https://www.facebook.com/");
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();

	}

	@Test(priority = 2,dependsOnMethods= {"OpenUrl"})
	void registerpage() {
		By mail = By.name("email");
		WebElement email = odriver.findElement(mail);
		email.sendKeys("sivakumarcreators@gmail.com");

		By id = By.id("pass");
		WebElement password = odriver.findElement(id);
		password.sendKeys("123456789");
	}

	@Test(priority = 4)

	void topics() {
		String currentUrl = odriver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	@Test(priority = 3)
	void title() {
		String title = odriver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=5)
	
	void appclose() {
	odriver.quit();
	}
}
