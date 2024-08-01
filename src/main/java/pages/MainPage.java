package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

    public class MainPage {
        private static WebDriver driver;
        private static WebDriverWait wait;

        public MainPage (WebDriver driver){
            this.driver = driver;
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            PageFactory.initElements(driver,this);
        }


        @FindBy(xpath = "//div[contains(@class, 'products-menu__title')]/a[contains(@href, '/ua/shop/grizunam')]")
        public WebElement rodentButton;
        public void clickOnRodentButton () {
            wait.until(ExpectedConditions.elementToBeClickable(rodentButton)).click();
        }

        @FindBy(xpath = "//div[contains(@class,'product-grid__img')]/a[contains(@href, '/ua/shop/grizunam/zasobi-vid-parazitiv')]")
        public WebElement medicineButton;
        public void clickOnMedicineButton() {
            wait.until(ExpectedConditions.elementToBeClickable(medicineButton)).click();
        }

        @FindBy(xpath = "//input[@id='ap-on']")
        public WebElement inStockButton;
        public void clickOnInStockButton() {
            wait.until(ExpectedConditions.elementToBeClickable(inStockButton)).click();
        }

        @FindBy(xpath = "//input[@id='mp-1']")
        public WebElement bioTestLabButton;
        public void clickOnBioTestLabButton() {
            wait.until(ExpectedConditions.elementToBeClickable(bioTestLabButton)).click();
        }
//
//        @FindBy(xpath = "//a[@onclick=\"compare.add('484')\"]")
//        public WebElement good3Button;
//        public void clickOnGood3Button() {
//            wait.until(ExpectedConditions.elementToBeClickable(good3Button)).click();
//        }

//        @FindBy(xpath = "(//a[@href=\"https://3kbaits.com.ua/index.php?route=product/compare\"]/span[contains(@class, 'links-text')])[1]")
//        public WebElement compareButton;
//        public void clickOnCompareButton () {
//            wait.until(ExpectedConditions.elementToBeClickable(compareButton)).click();
//        }
    }