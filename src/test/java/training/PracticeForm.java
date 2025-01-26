package training;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class PracticeForm {

    //cream o metoda de test care sa mearga de pe pagina principala pina
    //pe pagina PracticeForm
    public WebDriver driver;

    @Test
    public void navigateFromHomepageToPracticeFormPage(){
        openBrowser();
        clickFormsMenu();
        clickOnPracticeFormSubmenu();
        fillFirstName();
        addPicture();



    }
    //facem o metoda care sa deschida browserul Chrome
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }

    //facem o metoda care sa dea click pe meniul Forms
    public void clickFormsMenu(){
        scrollDown();
        WebElement FormsMenuElement = driver.findElement(By.xpath("//h5[text()='Forms']"));
        FormsMenuElement.click();
    }
    //facem o metoda care sa dea scroll in jos pe pagina
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

    }
    public void clickOnPracticeFormSubmenu(){
        WebElement practiceFormSubmenuElement = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        practiceFormSubmenuElement.click();

    }
    //facem o metoda care sa completeze campul First name
    public void fillFirstName(){
        WebElement firstNameFieldElement = driver.findElement(By.id("firstName"));
        firstNameFieldElement.sendKeys("Irina");


    }
    public void addPicture(){
        String pictureFilePath = "src/test/resources/Capture.PNG";
        File file = new File(pictureFilePath);
        WebElement inputPictureElements = driver.findElement(By.cssSelector("#uploadPicture"));
        inputPictureElements.sendKeys(file.getAbsolutePath());

    }
    //facem o metoda prin care sa luam dimensiunea initiala a tabelului
    //facem o metoda prin care sa validam ca dupa introducerea datelor in formular, am mai introdus
    //un rand


}
