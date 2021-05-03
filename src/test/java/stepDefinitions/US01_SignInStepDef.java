package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US01_SignInStepDef {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Given("user is on the SignIn page")
    public void user_is_on_the_SignIn_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("signIn_url"));
    }

    @And("user provides username {string}")
    public void user_provides_username(String username) {
        loginPage.userNameTextBox.sendKeys(username);
    }

    @And("user provides password {string}")
    public void user_provides_password(String password) {
        loginPage.passwordTextBox.sendKeys(password);

    }

    @And("user clicks signInButton")
    public void user_clicks_signInButton() {
        loginPage.signInButton.click();
    }

    @Then("user must be signIn")
    public void user_must_be_signIn() {
        String expectedTitleName = "PRODUCTS";
        Assert.assertEquals(expectedTitleName, productsPage.productTitle.getText());
    }

}
