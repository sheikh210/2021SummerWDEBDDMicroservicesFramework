package pom;

import baseAPI.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankOfAmericaHomepage extends BaseClass {

    @FindBy (id = "navChecking")
    public WebElement checkingsButton;

    public BankOfAmericaHomepage() {
        PageFactory.initElements(driver, this);
    }

    public CheckingsPage navigateToCheckingsPage() {
        checkingsButton.click();

        return new CheckingsPage();
    }
}
