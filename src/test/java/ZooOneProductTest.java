import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;
import java.time.Duration;

@Listeners({AllureTestNg.class})

public class ZooOneProductTest {

        private WebDriver driver;
        private WebDriverWait wait;
        private MainPage mainPage;

        @BeforeTest
        void setupDriver() {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            driver = new ChromeDriver();
            driver.get("https://zoolandia.com.ua/");
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            mainPage = new MainPage(driver);
              }

        @Test

        public void ClickTest(){
            mainPage.clickOnRodentButton();
            mainPage.clickOnMedicineButton();
            mainPage.clickOnInStockButton();
            mainPage.clickOnBioTestLabButton();
            Assert.assertEquals(driver.findElements(By.xpath("//div/div[contains(@style, 'opacity: 1; display: block ;')]")).size(), 1);
        }

        @AfterTest
        void closeDriver(){
            driver.quit();
        }
    }

