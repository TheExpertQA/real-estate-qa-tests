package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

    public class InvalidLoginTest {
        WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://practicetestautomation.com/practice-test-login/");
        }

        @Test
        public void testInvalidLogin() {
            driver.findElement(By.id("username")).sendKeys("wronguser");
            driver.findElement(By.id("password")).sendKeys("wrongpass");
            driver.findElement(By.id("submit")).click();

            String errorMsg = driver.findElement(By.id("error")).getText();
            Assert.assertTrue(errorMsg.contains("Your username is invalid!"));
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }


