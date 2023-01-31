package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

public class steps {
	
	public WebDriver driver;
	public LoginPage lp;
	String title1="Facebook-log in or sign up";
	String title2="(1)Facebook";
	
	
	@Given("Open the browsewr and enter the testURL as {string}")
	public void open_the_browsewr_and_enter_the_test_url(String testURL) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(testURL);
		
		lp= new LoginPage(driver);
	    
	}

	@Then("Login Page is Displayed")
	public void login_page_is_displayed() 
	{
	    Assert.assertTrue(title1.contains("Facebook"));
	}

	@When("Enter Valid Username as {string} and valid Password as {string}")
	public void enter_valid_username_as_and_valid_paadword_as(String Username, String Password) 
	{
	  lp.enterValidMail(Username);
	  lp.enterValidpassword(Password);
	}

	@When("click on Login button")
	public void click_on_login_button()
	{
		lp.clickOnLoginbutton();
	    
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() 
	{
	    Assert.assertTrue(title1.contains("(1)Facebook"));
	    driver.quit();

	}
}
