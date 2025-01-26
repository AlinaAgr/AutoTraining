import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class browserWindowTest {
    WebDriver driver;

    @Test
    public void testMethod(){
        openBrowser();
        clickOnAlertsFrameAndWindowMenu();
        clickOnBrowserWindowSubMenu();
        clickOnNewTabButton();
    }
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().setSize(new Dimension(1980, 1080));
    }

    public void clickOnAlertsFrameAndWindowMenu(){
        scrollDown();
        WebElement alertsMenuElements = driver.findElement(By.xpath("//h5[text() = 'Alerts, Frame & Windows']"));
        alertsMenuElements.click();
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
    }

    public void clickOnBrowserWindowSubMenu(){
        WebElement browserWindowSubMenuElement = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        browserWindowSubMenuElement.click();
    }

    public void clickOnNewTabButton() {
        WebElement newTabButtonElement = driver.findElement(By.xpath("//button[@id='tabButton']"));

    }

}