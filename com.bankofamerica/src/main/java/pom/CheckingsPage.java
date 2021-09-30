package pom;

import baseAPI.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class CheckingsPage extends BaseClass {

    public CheckingsPage() {
        PageFactory.initElements(driver, this);
    }
}
