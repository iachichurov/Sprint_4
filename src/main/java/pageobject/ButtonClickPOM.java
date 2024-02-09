package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ButtonClickPOM {
    private final WebDriver driver;
    public ButtonClickPOM(WebDriver driver){
        this.driver = driver;
    }

    private final By headOrderButton = By.className("Button_Button__ra12g");
    private final By bodyOrderButton =
            By.xpath("//div[@class=\"Home_FinishButton__1_cWm\"]/button[text()=\"Заказать\"]");
    private static By cookieButtonClick() {
        return By.className("App_CookieButton__3cvqF");
    }


    public void clickHeaderOrderButton(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(headOrderButton).click();
    }

    public void clickBodyOrderButton(){
        driver.findElement(bodyOrderButton).click();
    }

    public void cookieClick() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.findElement(cookieButtonClick()).click();
    }


}
