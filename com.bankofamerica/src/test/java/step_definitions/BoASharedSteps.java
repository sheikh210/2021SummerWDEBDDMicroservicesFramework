package step_definitions;

import baseAPI.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BoASharedSteps extends BaseClass {

    @Before
    public void driverSetUp() {
        String browser = "Chrome";
        setUp(browser);
        openBankOfAmericaApplication();
    }

    @After
    public void driverTearDown() {
        driver.close();
        driver.quit();
    }

    public void openBankOfAmericaApplication() {
        String url = "https://bankofamerica.com";
        driver.get(url);
    }

}
