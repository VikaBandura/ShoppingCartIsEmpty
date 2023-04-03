package com.softserve.edu.opencart.tests;

import com.softserve.edu.opencart.pages.HomePage;
import com.softserve.edu.opencart.pages.ShoppingCartEmptyPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class ShopinCartTest extends TestRunnerFirst {
    private final String BASE_URL = "https://demo.opencart.com/";
    private final Long IMPLICITLY_WAIT_SECONDS = 10L;
    private final Long ONE_SECOND_DELAY = 1000L;
    //private WebDriver driver;
    private HomePage homePage;
    private ShoppingCartEmptyPage shoppingCartEmptyPage;

    // Overload
//    protected void presentationSleep() {
//        presentationSleep(1);
//    }
//
//    // Overload
//    protected void presentationSleep(int seconds) {
//        try {
//            Thread.sleep(seconds * ONE_SECOND_DELAY); // For Presentation ONLY
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//
//    @BeforeSuite
//    public void beforeSuite() {
//        WebDriverManager.chromedriver().setup();
//        // WebDriverManager.firefoxdriver().setup();
//    }
//
//    @BeforeClass
//    public void beforeClass() {
//        driver = new ChromeDriver();
//        //driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT_SECONDS));
//        driver.manage().window().maximize();
//    }
//
//    @AfterClass(alwaysRun = true)
//    public void afterClass() {
//        presentationSleep(); // For Presentation ONLY
//        // driver.close();
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//
//    @BeforeMethod
//    public void beforeMethod() {
//        driver.get(BASE_URL);
//        presentationSleep(); // For Presentation ONLY
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//        presentationSleep(); // For Presentation ONLY
//        // logout; clear cache; delete cookie; delete session;
//        // Save Screen;
//    }
//
//    protected HomePage loadApplication() {
//        //driver.get(BASE_URL);
//        return new HomePage(driver);
//    }

    @Test
    public void checkShoppingCart() throws InterruptedException {

        homePage = new HomePage(driver);

        homePage.clickShoppingCart();
        shoppingCartEmptyPage = new ShoppingCartEmptyPage(driver);
        assertTrue(shoppingCartEmptyPage.isShoppingCartDisplayed());
        assertTrue(shoppingCartEmptyPage.isShoppingCartEmptyDisplayed());
        shoppingCartEmptyPage.gotoContinue();
        assertTrue(homePage.getHomePageURL().contains("home"));

//        WebElement emptyCartLabel = driver.findElement(By.name("Your shopping cart is empty!"));
//
//        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//        loadApplication();
    }
}
