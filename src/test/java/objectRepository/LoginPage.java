package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement LoginButton;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	
	public void enterValidMail(String mail)
	{
		email.sendKeys(mail);
	}
	public void enterValidpassword(String password1)
	{
		password.sendKeys(password1);
	}
	
	public void clickOnLoginbutton()
	{
		LoginButton.click();
	}
	
	
	

}
