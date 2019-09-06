package study4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class stu4 {
	
 WebDriver driver;
	@Given("Open the TestMe Homepage")
	public void open_the_TestMe_Homepage() {
		System.setProperty("webdriver.chrome.driver","C:\\\\arabi\\\\drivers\\\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    driver.manage().window().maximize();
	}

	@Given("Search {string} in the find details")
	public void search_in_the_find_details(String string) {
	   driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
	}

	@Given("Click find Details")
	public void click_find_Details() {
	   driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("Click the Add to Cart icon")
	public void click_the_Add_to_Cart_icon() {
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@Then("User go to the login page")
	public void user_go_to_the_login_page() {
		Assert.assertEquals("Login",driver.getTitle());
	}


}
