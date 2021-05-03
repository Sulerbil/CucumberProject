package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPage {
    public ProductsPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[text()='Products']")
    public WebElement productTitle;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    public WebElement BikeLight;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement Backpack;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement CartButton;
}
