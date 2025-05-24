package tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

    public class LoginTest {

        WebDriver driver;

        @BeforeClass
        public void setUp() {
            // Set path to your chromedriver.exe if not in system PATH

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://practicetestautomation.com/practice-test-login/");
        }

        @Test
        public void testValidLogin() {
            driver.findElement(By.id("username")).sendKeys("student");
            driver.findElement(By.id("password")).sendKeys("Password123");
            driver.findElement(By.id("submit")).click();

            // Verify successful login by checking the success message or URL
            String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
            Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login failed or wrong redirect URL.");
        }

        @AfterClass
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }


