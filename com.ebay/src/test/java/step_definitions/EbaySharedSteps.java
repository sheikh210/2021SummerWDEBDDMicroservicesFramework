package step_definitions;

import baseAPI.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class EbaySharedSteps extends BaseClass {

    @Before
    public void driverSetUp() {
        String browser = "Chrome";
        setUp(browser);
        openEbayApplication();
    }

    @After
    public void driverTearDown() {
        driver.close();
        driver.quit();
    }

    public void openEbayApplication() {
        String url = "https://ebay.com";
        driver.get(url);
    }
}
