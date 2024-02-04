package pageobject;

import org.openqa.selenium.WebDriver;
import locators.MainPageLocators;

public class OrderButtonClickPOM {
    private WebDriver driver;
    public OrderButtonClickPOM(WebDriver driver){
        this.driver = driver;
    }

    public void clickHeaderOrderButton(){
        driver.findElement(MainPageLocators.headOrderButton).click();
    }

    public void clickBodyOrderButton(){
        driver.findElement(MainPageLocators.bodyOrderButton).click();
    }


}
