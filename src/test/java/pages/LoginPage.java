package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@placeholder='Password']" )
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class='error-message-container error']" )
    public WebElement failMessage;
}
